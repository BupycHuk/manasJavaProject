package hello.Model.RequestDto;

import java.io.Serializable;

public class WrittenOffProductRequest implements Serializable {
    private long productId;
    private String productName;
    private  Integer count;
    private  Double price;

    public WrittenOffProductRequest(){

    }

    public WrittenOffProductRequest(long shopId, String sellername,Integer productCount,Double productPrice) {
        this.productId = shopId;
        this.productName = sellername;
        this.count =productCount;
        this.price =productPrice;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId)
    {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
