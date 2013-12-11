package javafxapplication.Proxy;

import javafxapplication.Model.RequestDto.BuyumSatuuRequest;
import javafxapplication.Model.Buyum;
import javafxapplication.Model.Seller;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 01.12.13
 * Time: 2:03
 * To change this template use File | Settings | File Templates.
 */
public class BuyumSatuuProxy extends Proxy {

    public boolean buyumSatuu(BuyumSatuuRequest buyumSatuuRequest)
    {
        try {
            restTemplate.postForObject(urlService.GetServerUrl("/buyumSatuu/"), buyumSatuuRequest, Buyum.class);
        }
        catch (Exception e)
        {
            return false;
        }
        return true;

    }
}
