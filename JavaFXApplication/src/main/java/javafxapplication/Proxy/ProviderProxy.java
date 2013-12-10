package javafxapplication.Proxy;

import javafxapplication.Model.Provider;

/**
 * Created by Imanali on 12/10/13.
 */
public class ProviderProxy extends Proxy {
    public Provider[] getProviders(){
        return restTemplate.getForObject(urlService.GetServerUrl("/providers"), Provider[].class);
    }
}
