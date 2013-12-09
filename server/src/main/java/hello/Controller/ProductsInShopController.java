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

//    @RequestMapping(value = "/delete/{product}")
//    public @ResponseBody
//    boolean deleteProduct(@PathVariable("product") String product) {
//        Iterable<ProductsInShop> productsInShop = getRepository().findByProduct(product);
//        getRepository().delete(productsInShop);
//        return true;
//    }
//    @RequestMapping(value = "/deleteProduct",method = RequestMethod.POST)
//    public @ResponseBody
//    ProductsInShop deleteProduct(@RequestBody DeleteProductRequest deleteProductRequest) {
//        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//        ShopRepository shopRepository = context.getBean(ShopRepository.class);
//        ProductRepository productRepository = context.getBean(ProductRepository.class);
//        Shop shop = shopRepository.findOne(deleteProductRequest.getShopId());
//        Product product= productRepository.findOne(deleteProductRequest.getProductId());
//
////        Seller seller= new Seller(addSellerRequest.getSellername(),addSellerRequest.getLogin(),addSellerRequest.getPassword());
//        ProductsInShop productsInShop= new ProductsInShop(deleteProductRequest.getProduct())//,deleteProductRequest.getProduct()){//deleteProductRequest.getSellername(),deleteProductRequest.getLogin(),);
////        productsInShop.setShop(shop);
//        productsInShop.setProduct(product);
//        getRepository().save(productsInShop);
//        return productsInShop;
//    }

    public ProductsInShopRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(ProductsInShopRepository.class);
    }
}

