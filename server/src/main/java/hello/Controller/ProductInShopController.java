package hello.Controller;

import hello.Config;
import hello.Model.ProductsInShop;
import hello.Model.ProductsInShopRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Imanali on 12/10/13.
 */


@Component
@Controller
public class ProductInShopController {

    @RequestMapping(value = "/productsinshop")
    public @ResponseBody
    Iterable<ProductsInShop> listProductsInShop(){
        return getRepository().findAll();
    }

    public ProductsInShopRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(ProductsInShopRepository.class);
    }
}
