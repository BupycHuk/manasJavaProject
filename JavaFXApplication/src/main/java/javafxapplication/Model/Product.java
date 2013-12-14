package javafxapplication.Model;


public class Product
{
    private long id;
    private String nameProduct;
    private Double price;

    public Product() {
    }


    public long getId() {
        return id;
    }


    public Double getPrice() {
        return price;
    }


    public String getName() {
        return nameProduct;
    }
    public String toString()
    {
        return getName();

    }

    public void setName(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
