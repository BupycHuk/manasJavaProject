package hello.Model.RequestDto;

import java.io.Serializable;

public class AddProductInShopRequest implements Serializable {
    private Integer count;
    private long shop;
    private long provider;
    private long proveder;
    private long product;

    public AddProductInShopRequest(){}

    public AddProductInShopRequest(Integer count, long shop, long provider, long product) {

        this.count = count;
        this.shop = shop;
        this.provider = provider;
        this.product = product;
    }


    public void setCount(Integer count) {
        this.count = count;
    }

    public long getCount() {
        return count;
    }

    public void setShop(long shop) {
        this.shop = shop;
    }

    public long getShop() {
        return shop;
    }

    public void setProvider(long provider) {
        this.provider = provider;
    }

    public long getProvider() {
        return provider;
    }

    public void setProveder(long proveder) {
        this.proveder = proveder;
    }

    public long getProveder() {
        return proveder;
    }

    public void setProduct(long product) {
        this.product = product;
    }

    public long getProduct() {
        return product;
    }
}
