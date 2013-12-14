package hello.Controller;

import hello.Config;
import hello.Model.*;
import hello.Model.RequestDto.WrittenOffProductRequest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Component
@Controller
public class SoldProductsController {

    @RequestMapping(value = "/soldProducts")
    public @ResponseBody
    Iterable<SoldProducts> listSoldProducts() {

        return  getRepository().findAll();
    }

    @RequestMapping(value = "/addSoldProducts",method = RequestMethod.POST)
    public @ResponseBody
    SoldProducts addSoldProducts(@RequestBody WrittenOffProductRequest writtenOffProductRequest) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ProductRepository productRepository = context.getBean(ProductRepository.class);
        Product product = productRepository.findOne(writtenOffProductRequest.getProductId());

//        SoldProducts soldProducts= new SoldProducts(writtenOffProductRequest.getProductId(),writtenOffProductRequest.getSellerName(),writtenOffProductRequest.getCount(),writtenOffProductRequest.getPrice());
        SoldProducts soldProducts= new SoldProducts(writtenOffProductRequest.getCount(),writtenOffProductRequest.getPrice());
        soldProducts.setProduct(product);
        getRepository().save(soldProducts);
        return soldProducts;
    }

    public SoldProductsRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(SoldProductsRepository.class);
    }
}
