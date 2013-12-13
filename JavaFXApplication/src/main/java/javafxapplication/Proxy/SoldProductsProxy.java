package javafxapplication.Proxy;

import javafxapplication.Model.RequestDto.AddSellerRequest;
import javafxapplication.Model.RequestDto.BuyumSatuuRequest;
import javafxapplication.Model.Seller;
import javafxapplication.Model.SoldProducts;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 01.12.13
 * Time: 2:03
 * To change this template use File | Settings | File Templates.
 */
public class SoldProductsProxy extends Proxy {

    public boolean soldProduct(BuyumSatuuRequest productSoltRequest)
    {
        try {
            restTemplate.postForObject(urlService.GetServerUrl("/buyumSatuu/"), productSoltRequest, SoldProducts.class);
        }
        catch (Exception e)
        {
            return false;
        }
        return true;

    }

    public SoldProducts[] getSoldProSductss() {
        return restTemplate.getForObject(urlService.GetServerUrl("/soldProducts/"), SoldProducts[].class);
    }
}
