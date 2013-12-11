package hello.Controller;

import hello.Config;
import hello.Model.RequestDto.AddSellerRequest;
import hello.Model.RequestDto.BuyumSatuuRequest;
import hello.Model.Seller;
import hello.Model.SellerRepository;
import hello.Model.ProductsInShop;
import hello.Model.ProductsInShopRepository;
import hello.Model.ForSeller;
import hello.Model.ForSellerRepository;
import hello.Model.Shop;
import hello.Model.ShopRepository;
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

//    @RequestMapping(value = "/buyumSatuu")
//    public @ResponseBody
//    Iterable<Seller> listSellers() {
//
//        return  getRepository().findAll();
//    }

    @RequestMapping(value = "/forSeller",method = RequestMethod.POST)
    public @ResponseBody
    ForSeller forSellers(@RequestBody BuyumSatuuRequest buyumSatuuRequest) {
       AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
       SellerRepository sellerRepository = context.getBean(SellerRepository.class);
       Seller sellers = sellerRepository.findOne(buyumSatuuRequest.getSatuuchuId());

        ForSeller seller= new ForSeller(buyumSatuuRequest.getBuyumAty(),buyumSatuuRequest.getSatylganSany());
        seller.setSeller(sellers);
        getRepository().save(seller);
        return seller;
    }
//    @RequestMapping(value = "/satylganBuyumduOchuruu/{productName}")
//    public @ResponseBody
//    boolean buyumduOchuruu(@PathVariable("productName") String name) {
//        Iterable<ProductsInShop> productsInShops = getsRepository().findByFullName(name);
//        getsRepository().delete(productsInShops);
//         return true;
//    }


    public ForSellerRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(ForSellerRepository.class);
    }
    public ProductsInShopRepository getsRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(ProductsInShopRepository.class);
    }
}

