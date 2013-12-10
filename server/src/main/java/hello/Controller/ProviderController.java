package hello.Controller;

import hello.Config;
import hello.Model.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 10.12.13
 * Time: 15:30
 * To change this template use File | Settings | File Templates.
 */
@Component
@Controller
public class ProviderController {
    @RequestMapping(value = "/providers")
    public @ResponseBody
    Iterable<Provider> listProviders() {

        return  getRepository().findAll();
    }

    @RequestMapping(value = "/delete/provider/{id}")
    public @ResponseBody
    boolean deleteProvider(@PathVariable("id") long id) {

        getRepository().delete(id);
        return true;
    }

    public ProviderRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(ProviderRepository.class);
    }

}

