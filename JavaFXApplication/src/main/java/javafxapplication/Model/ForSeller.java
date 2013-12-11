/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafxapplication.Model;

/**
 *
 * @author Akim
 */

public class ForSeller {
    private long id;
    private String byuymAty;
    private String satylganSany;

    protected ForSeller() {}

    public ForSeller(String byuymAty, String satylganSany) {
        this.byuymAty = byuymAty;
        this.satylganSany = satylganSany;
    }


    public String getByuymAty() {
        return byuymAty;
    }

    public void setByuymAty(String byuymAty) {
        this.byuymAty = byuymAty;
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

    private Seller seller;

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public String getSellerName()
    {
        if (getSeller()!=null)
            return getSeller().getFullName();
        return null;
    }
}

