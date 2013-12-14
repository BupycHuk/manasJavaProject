package hello.Controller;

import hello.Config;
import hello.Model.ProductsInShop;
import hello.Model.ProductsInShopRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@Controller
public class ProductInShopController {

    @RequestMapping(value = "/productsinshop/{Shop}")
    public @ResponseBody
    Iterable<ProductsInShop> listProductsInShop(@PathVariable("Shop") String Shop){
        return getRepository().findByName(Shop);
    }


    public ProductsInShopRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(ProductsInShopRepository.class);
    }
}
