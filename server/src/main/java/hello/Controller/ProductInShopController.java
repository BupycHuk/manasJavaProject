package hello.Controller;

import hello.Config;
import hello.Model.*;
import hello.Model.RequestDto.AddProductInShopRequest;
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
public class ProductInShopController {

    @RequestMapping(value = "/productsinshop")
    public @ResponseBody
    Iterable<ProductsInShop> listProductsInShop(){
        return getRepository().findAll();
    }

    @RequestMapping(value = "/addproductsinshop",method = RequestMethod.POST)
    public @ResponseBody
    ProductsInShop addSeller(@RequestBody AddProductInShopRequest addProductInShopRequest) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        ShopRepository shopRepository = context.getBean(ShopRepository.class);
        Shop shop = shopRepository.findOne(addProductInShopRequest.getShop());

        ProductRepository productRepository = context.getBean(ProductRepository.class);
        Product product = productRepository.findOne(addProductInShopRequest.getProduct());

        ProviderRepository providerRepository  = context.getBean(ProviderRepository.class);
        Provider provider = providerRepository.findOne(addProductInShopRequest.getProvider());

        ProductsInShop productsInShop =new ProductsInShop(shop,addProductInShopRequest.getCount(),product,provider);

        getRepository().save(productsInShop);

        return productsInShop;
    }


    public ProductsInShopRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(ProductsInShopRepository.class);
    }
}
