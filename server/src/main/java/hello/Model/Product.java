package hello.Model;

import javax.persistence.*;

@Entity
public class Product
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @Column(name="nameProduct")
    private String nameProduct;
    @Column(name="price")
    private Double price;
    @Column (name="sold")
    private boolean sold;


    public long getId() {
        return id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String name) {
        this.nameProduct = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }
}
