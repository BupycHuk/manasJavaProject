package hello.Controller;

import hello.Config;
import hello.Model.*;
//import hello.Model.RequestDto.DeleteProductRequest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Component
@Controller
public class ProductsInShopController {

    @RequestMapping(value = "/productsInShop")
    public @ResponseBody
    Iterable<ProductsInShop> listProducts() {

        return  getRepository().findAll();
    }

    public ProductsInShopRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(ProductsInShopRepository.class);
    }
}

