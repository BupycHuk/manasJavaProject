package hello.Controller;

import hello.Config;
import hello.Model.SoldProducts;
import hello.Model.SoldProductsRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Component
@Controller
public class SoldProductsController {

    @RequestMapping(value = "/soldProducts")
    public @ResponseBody
    Iterable<SoldProducts> listSoldProducts() {

        return  getRepository().findAll();
    }

    public SoldProductsRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(SoldProductsRepository.class);
    }
}
