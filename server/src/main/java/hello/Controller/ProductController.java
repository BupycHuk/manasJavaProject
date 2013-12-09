package hello.Controller;

import hello.Config;
import hello.Model.Product;
import hello.Model.ProductRepository;
import hello.Model.ProviderRepository;
import hello.Model.ProductsInShop;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Component
@Controller
public class ProductController {

    @RequestMapping(value = "/products")
    public @ResponseBody
    Iterable<Product> listProducts() {

        return  getRepository().findAll();
    }

    public ProductRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(ProductRepository.class);
    }
}
