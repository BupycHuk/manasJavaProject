package javafxapplication.Proxy;
import javafxapplication.Model.RequestDto.WrittingOffProductRequest;
import javafxapplication.Model.SoldProducts;

public  class SoldProductsProxy extends Proxy {

        public boolean writtingOffProduct(WrittingOffProductRequest writtingOffProductRequest)
        {
            try {
                restTemplate.postForObject(urlService.GetServerUrl("/addSoldProducts/"), writtingOffProductRequest, SoldProducts.class);
            }
            catch (Exception e)
            {
                return false;
            }
            return true;

        }


        public  SoldProducts[]  getSoldProductsInfo() {
        return restTemplate.getForObject(urlService.GetServerUrl("/soldProducts/"), SoldProducts[].class);
    }
}
