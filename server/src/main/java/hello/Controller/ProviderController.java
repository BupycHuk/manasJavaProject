package hello.Controller;

import hello.Config;
import hello.Model.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Admin on 10.12.13.
 */
@Component
@Controller
public class ProviderController {

    @RequestMapping(value = "/providers")
    public @ResponseBody
    Iterable<Provider> listProviders() {

        return  getRepository().findAll();
    }

    public ProviderRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(ProviderRepository.class);
    }
}
