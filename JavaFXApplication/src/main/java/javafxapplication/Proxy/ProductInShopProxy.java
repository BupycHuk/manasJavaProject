package javafxapplication.Proxy;

/**
 * Created by Imanali on 12/10/13.
 */

import javafxapplication.Model.RequestDto.*;
import javafxapplication.Model.*;

public class ProductInShopProxy extends Proxy {
    public boolean addProduct(AddProductInShopRequest addProductInShopRequest){
        try {
            restTemplate.postForObject(urlService.GetServerUrl("/productsinshop/"), addProductInShopRequest, ProductInShop.class);
        }
        catch (Exception e)
        {
            return false;
        }
        return true;
    }

    public ProductInShop[] getProductInShopProxies() {
        return restTemplate.getForObject(urlService.GetServerUrl("/productsinshop/"), ProductInShop[].class);
    }
}
