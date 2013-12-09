package hello.Model.RequestDto;

import java.io.Serializable;

/**
* Created with IntelliJ IDEA.
* User: admin
* Date: 12/9/13
* Time: 9:40 AM
* To change this template use File | Settings | File Templates.
*/
public class DeleteProductRequest {
    private long shopId;
    private long productId;
    private String sellername;
    private String login;
    private String password;
    private  String product;
//    private Object productId;

    public DeleteProductRequest()
    {

    }

    public DeleteProductRequest(long shopId, String sellername, String login, String product,Long productId) {
        //To change body of created methods use File | Settings | File Templates.
        this.shopId = shopId;
        this.productId = productId;
//        this.sellername = sellername;
//        this.login = login;
        this.product = product;
    }

    public long getShopId() {
        return shopId;
    }

    public void setShopId(long shopId)
    {
        this.shopId =shopId;
    }

//    public String getSellername() {
//        return sellername;
//    }
//
//    public void setSellername(String sellername)
//    {
//        this.sellername=sellername;
//    }
//
//
//    public String getLogin() {
//        return login;
//    }
//
//    public void setLogin(String login)
//    {
//        this.login = login;
//    }

//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password)
//    {
//        this.password = password;
//    }

//    public Object getProductId() {
//        return productId;
//    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getProductId() {
        return productId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

//    public long getProduct() {
//        return product;
//    }
}
