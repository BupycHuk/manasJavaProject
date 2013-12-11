package javafxapplication.Proxy;

import javafxapplication.Model.RequestDto.*;
import javafxapplication.Model.*;

public class ProductInShopProxy extends Proxy {
    public boolean addProductInShop(AddProductInShopRequest addProductInShopRequest){
        try {
            restTemplate.postForObject(urlService.GetServerUrl("/addproductsinshop"), addProductInShopRequest, AddProductInShopRequest.class);
        }
        catch (Exception e)
        {
            return false;
        }
        return true;
    }

    public ProductsInShop[] getProductInShopProxies() {
        return restTemplate.getForObject(urlService.GetServerUrl("/productsinshop/"), ProductsInShop[].class);
    }
}
