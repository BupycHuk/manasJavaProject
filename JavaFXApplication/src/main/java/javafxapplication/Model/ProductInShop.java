package javafxapplication.Model;

public class ProductInShop {
    private long id;
    private Integer count;

    protected ProductInShop() {}

    public ProductInShop(Shop shop, Integer count) {
        this.shop = shop;
        this.count=count;
    }

    public long getId() {
        return id;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCount() {
        return count;
    }

    private Shop shop;

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Shop getShop() {
        return shop;
    }
    public String getShopname(){
        if (getShopname()!=null){
            return getShop().getName();
        }
        return null;
    }


    private Provider Name;
    public void setName(Provider provider){
        this.Name=provider;
    }
    public Provider getName(){
        return Name;
    }


    public String getProviderName(){
        if (getProviderName()!=null){
            return getName().getName();
        }
        return null;
    }


    private Product product;

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public String getProductName(){
        if (getProviderName()!=null){
            return getProduct().getName();
        }
        return null;
    }
}
