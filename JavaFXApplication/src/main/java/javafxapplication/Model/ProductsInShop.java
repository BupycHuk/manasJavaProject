package javafxapplication.Model;


public class ProductsInShop
{
    private long id;
    private Integer count;
    private Shop shop;
    private Provider provider;
    private Product product;
    private Product price;

    public ProductsInShop() {
    }

    public ProductsInShop(Integer count, Shop shop, Product product, Provider provider,Product price){
        this.count=count;
        this.shop =shop;
        this.provider=provider;
        this.product=product;
        this.price=price;

    }

    public long getId() {
        return id;
    }


    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public String getShopname()
    {
        if (getShop()!=null)
            return getShop().getName();
        return null;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
    public Provider getName() {
        return provider;
    }

    public void setName(Provider provider) {
        this.provider = provider;
    }

    public String getNameProvider()
    {
        if (getName()!=null)
            return getName().getName();
        return null;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getNameProduct()
    {
        if (getProduct()!=null)
            return getProduct().getName();
        return null;
    }

    public Product getPrice() {
        return price;
    }

    public void setPrice(Product price) {
        this.price = price;
    }
    public Double getPriceProduct()
    {
        if (getProduct()!=null)
            return getProduct().getPrice();
        return null;
    }
}
