package javafxapplication.Proxy;

import javafxapplication.Model.Product;

/**
 * Created by Admin on 10.12.13.
 */
public class ProductProxy extends Proxy {

    public Product[] getProducts() {
        Product soldProduct = new Product();

            return restTemplate.getForObject(urlService.GetServerUrl("/products/"), Product[].class);


    }
}
