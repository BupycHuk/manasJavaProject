package hello.Model.RequestDto;

import java.io.Serializable;

public class WrittenOffProductRequest implements Serializable {
    private long productId;
    private String sellerName;
    private  Integer count;
    private  Double price;

    public WrittenOffProductRequest(){

    }

    public WrittenOffProductRequest(long productId, String sellerName,Integer count,Double price) {
        this.productId = productId;
        this.sellerName = sellerName;
        this.count =count;
        this.price =price;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId)
    {
        this.productId = productId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName)
    {
        this.sellerName = sellerName;
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
