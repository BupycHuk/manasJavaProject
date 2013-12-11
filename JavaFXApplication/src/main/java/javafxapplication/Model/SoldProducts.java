package javafxapplication.Model;

public class SoldProducts {
    private long id;
    private Integer count;
    private Double price;
    private Seller seller;
    private Product product;

    protected SoldProducts() {}

    public SoldProducts(Integer count, Double price,Seller seller,Product product) {
        this.count = count;
        this.price = price;
        this.seller = seller;
        this.product = product;
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

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
    public String getNameSeller()
    {
        if (getSeller()!=null)
            return getSeller().getFullName();
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
        if(getProduct()!=null)
            return getProduct().getName();
        return  null;
    }

    public long getId() {
        return id;
    }
}
