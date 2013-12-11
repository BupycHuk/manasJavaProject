package javafxapplication.Model.RequestDto;

import java.io.Serializable;

public class WrittingOffProductRequest implements Serializable {
    private long productId;
    private String product;

    public WrittingOffProductRequest()
    {

    }

    public WrittingOffProductRequest(long productId, String product) {
        this.productId = productId;
        this.product = product;
    }

    public WrittingOffProductRequest(long productId) {
        this.productId=productId;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId)
    {
        this.productId = productId;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product)
    {
        this.product = product;
    }
}
