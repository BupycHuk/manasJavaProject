package javafxapplication.Proxy;

import javafxapplication.Model.Provider;
import javafxapplication.Model.RequestDto.*;
import javafxapplication.Model.Seller;

public class ProviderProxy extends Proxy {
    public boolean addProvider(AddProviderRequest addProviderRequest)
    {
        try {
            restTemplate.postForObject(urlService.GetServerUrl("/addprovider/"), addProviderRequest, Seller.class);
        }
        catch (Exception e)
        {
            return false;
        }
        return true;

    }

    public Provider[] getProviders(){
        return restTemplate.getForObject(urlService.GetServerUrl("/providers/"), Provider[].class);
    }
}
