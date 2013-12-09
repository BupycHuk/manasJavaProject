package javafxapplication.Proxy;

import javafxapplication.Model.ProductsInShop;
import javafxapplication.Tools.UrlService;
import org.springframework.web.client.RestTemplate;

public  class ProductsInShopProxy extends Proxy {


    public  ProductsInShop[]  getProductsInfo() {
        return restTemplate.getForObject(urlService.GetServerUrl("/productsInShop/"), ProductsInShop[].class);
    }
}
