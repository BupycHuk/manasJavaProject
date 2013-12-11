package hello.Model;

import javax.persistence.*;

@Entity
public class ForSeller {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="buyumAty")
    private String buyumAty;
    @Column(name="satylganSany")
    private String satylganSany;

    protected ForSeller() {}

    public ForSeller(String buyumAty, String satylganSany) {
        this.buyumAty = buyumAty;
        this.satylganSany = satylganSany;
    }


    public String getBuyumAty() {
        return buyumAty;
    }

    public void setBuyumAty(String buyumAty) {
        this.buyumAty = buyumAty;
    }

    public String getSatylganSany() {
        return satylganSany;
    }

    public void setSatylganSany(String satylganSany) {
        this.satylganSany = satylganSany;
    }

    public long getId() {
        return id;
    }
    public void setId(long Id)
    {
        this.id = Id;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "seller")
    private Seller seller;

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
}

