package javafxapplication.Proxy;

import javafxapplication.Model.Provider;
/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 10.12.13
 * Time: 15:35
 * To change this template use File | Settings | File Templates.
 */
public class ProviderProxy extends Proxy {

    public Provider[] getProviders() {
        return restTemplate.getForObject(urlService.GetServerUrl("/providers/"), Provider[].class);
    }

    public void providerDelete(long id){

        restTemplate.getForObject(urlService.GetServerUrl("/delete/provider/"+id), Provider[].class);
    }
}
