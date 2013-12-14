package javafxapplication.Proxy;

import javafxapplication.Model.ProductInShop;

/**
 * Created by Imanali on 12/14/13.
 */
public class ProductInShopProxy extends Proxy {
    public ProductInShop[] getProductInShops(String name){

        String Url=String.format("/productsinshop/%s", name);
        return  restTemplate.getForObject(urlService.GetServerUrl(Url), ProductInShop[].class);
    }
}
