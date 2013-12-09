package hello.Controller;

import hello.Config;
import hello.Model.Provider;
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
