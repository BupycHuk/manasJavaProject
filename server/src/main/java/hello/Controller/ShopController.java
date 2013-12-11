package hello.Controller;

import hello.Config;
import hello.Model.RequestDto.AddShopRequest;
import hello.Model.Shop;
import hello.Model.ShopRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@Controller
public class ShopController {
    @RequestMapping(value = "/shops")
    public @ResponseBody
    Iterable<Shop> listSellers() {
        return  getRepository().findAll();
    }

    @RequestMapping(value = "/addshop")
    public @ResponseBody
    Shop addShop(@RequestBody AddShopRequest addShopRequest) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Shop shop= new Shop(addShopRequest.getName(),addShopRequest.getContacts());
        getRepository().save(shop);
        return shop;
    }

    public ShopRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(ShopRepository.class);
    }
}

