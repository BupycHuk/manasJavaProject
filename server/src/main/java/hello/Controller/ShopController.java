package hello.Controller;

import hello.Config;
import hello.Model.Shop;
import hello.Model.ShopRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
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

    public ShopRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(ShopRepository.class);
    }
}

