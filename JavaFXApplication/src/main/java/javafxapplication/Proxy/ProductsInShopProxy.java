package javafxapplication.Proxy;

import javafxapplication.Model.ProductsInShop;

public  class ProductsInShopProxy extends Proxy {


    public  ProductsInShop[]  getProductsInfo() {
        return restTemplate.getForObject(urlService.GetServerUrl("/productsInShop/"), ProductsInShop[].class);
    }
}

