package hello.Controller;

import hello.Config;
import hello.Model.RequestDto.SoldProductsRequest;
import hello.Model.Seller;
import hello.Model.SoldProducts;
import hello.Model.SellerRepository;
import hello.Model.SoldProductsRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 27.10.13
 * Time: 13:03
 * To change this template use File | Settings | File Templates.
 */

@Component
@Controller
public class BuyumSatuuController {

    @RequestMapping(value = "/soldProduct")
    public @ResponseBody
    Iterable<SoldProducts> listSoldProducts() {

        return  getRepository().findAll();
    }

    @RequestMapping(value = "/soldProducts",method = RequestMethod.POST)
    public @ResponseBody
    SoldProducts soldproducts(@RequestBody SoldProductsRequest soldProductsRequest) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        SellerRepository sellerRepository = context.getBean(SellerRepository.class);
        Seller seller = sellerRepository.findOne(soldProductsRequest.getSellerId());

        SoldProducts soldProducts= new SoldProducts(soldProductsRequest.getBuyumAty(),soldProductsRequest.getBuyumSany());
        soldProducts.setSeller(seller);
        getRepository().save(soldProducts);
        return soldProducts;
    }
//    @RequestMapping(value = "/delete/{name}")
//    public @ResponseBody
//    boolean deleteUser(@PathVariable("name") String name) {
//        Iterable<Seller> seller = getRepository().findByFullName(name);
//        getRepository().delete(seller);
//         return true;
//    }

    public SoldProductsRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(SoldProductsRepository.class);
    }
}

