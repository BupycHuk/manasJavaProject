package hello.Controller;

import hello.Config;
import hello.Model.*;
import hello.Model.RequestDto.AddProviderRequest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Component
@Controller
public class ProviderController {

    @RequestMapping(value = "/providers")
    public @ResponseBody
    Iterable<Provider> listProviders() {

        return  getRepository().findAll();
    }

    @RequestMapping(value = "/addProviders",method = RequestMethod.POST)
    public @ResponseBody
    Provider addSeller(@RequestBody AddProviderRequest addProviderRequest) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Provider provider= new Provider(addProviderRequest.getContacts(),addProviderRequest.getName());
        getRepository().save(provider);
        return provider;
    }
//    @RequestMapping(value = "/delete/{name}")
//    public @ResponseBody
//    boolean deleteUser(@PathVariable("name") String name) {
//        Iterable<Seller> seller = getRepository().findByFullName(name);
//        getRepository().delete(seller);
//        return true;
//    }

    public ProviderRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(ProviderRepository.class);
    }
}
