package javafxapplication.Proxy;

import javafxapplication.Model.RequestDto.AddShopRequest;
import javafxapplication.Model.Shop;

public class ShopProxy extends Proxy {

    public boolean addShop(AddShopRequest addShopRequest)
    {
        try {
            restTemplate.postForObject(urlService.GetServerUrl("/addshop/"), addShopRequest, Shop.class);
        }
        catch (Exception e)
        {
            return false;
        }
        return true;

    }

    public Shop[] getShops() {
        return restTemplate.getForObject(urlService.GetServerUrl("/shops/"), Shop[].class);
    }
}
