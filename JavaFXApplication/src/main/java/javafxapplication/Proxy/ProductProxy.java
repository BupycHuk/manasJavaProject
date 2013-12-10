package javafxapplication.Proxy;

/**
 * Created by Imanali on 12/10/13.
 */
import javafxapplication.Model.*;
public class ProductProxy extends Proxy {
    public Product[] getRProducts(){
        return restTemplate.getForObject(urlService.GetServerUrl("/products/"), Product[].class);
    }
}
