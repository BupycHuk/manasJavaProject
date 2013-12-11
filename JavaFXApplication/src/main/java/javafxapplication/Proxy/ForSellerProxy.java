package javafxapplication.Proxy;

import javafxapplication.Model.RequestDto.AddSellerRequest;
import javafxapplication.Model.RequestDto.BuyumSatuuRequest;
import javafxapplication.Model.Seller;
import javafxapplication.Model.ForSeller;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 01.12.13
 * Time: 2:03
 * To change this template use File | Settings | File Templates.
 */
public class ForSellerProxy extends Proxy {

    public boolean buyumsatuu(BuyumSatuuRequest buyumSatuuRequest)
    {
        try {
            restTemplate.postForObject(urlService.GetServerUrl("/buyumSatuu/"), buyumSatuuRequest, ForSeller.class);
        }
        catch (Exception e)
        {
            return false;
        }
        return true;

    }

    public ForSeller[] getForSellers() {
        return restTemplate.getForObject(urlService.GetServerUrl("/forSellers/"), ForSeller[].class);
    }
}
