package javafxapplication.Proxy;

import javafxapplication.Model.Provider;
/**
 * Created by Admin on 10.12.13.
 */
public class ProviderProxy extends Proxy{

    public Provider[] getProviders() {
        return restTemplate.getForObject(urlService.GetServerUrl("/providers/"), Provider[].class);
    }
}
