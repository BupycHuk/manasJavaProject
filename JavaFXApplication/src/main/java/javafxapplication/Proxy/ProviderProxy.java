package javafxapplication.Proxy;

import javafxapplication.Model.Provider;

public class ProviderProxy extends Proxy {

    public Provider[] getProviders() {
        return restTemplate.getForObject(urlService.GetServerUrl("/providers/"), Provider[].class);
    }
}

