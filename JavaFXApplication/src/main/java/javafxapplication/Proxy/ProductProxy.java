package javafxapplication.Proxy;

import javafxapplication.Model.Product;

public class ProductProxy extends Proxy {

    public Product[] getProducts() {
        return restTemplate.getForObject(urlService.GetServerUrl("/products/"), Product[].class);
    }
}
