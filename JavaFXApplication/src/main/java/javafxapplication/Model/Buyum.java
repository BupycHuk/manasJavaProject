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

public class Buyum {
    private long id;
    private String buyumAty;
    private String satylganSany;

    protected Buyum() {}

    public Buyum(String buyumAty, String satylganSany) {
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

    private Seller seller;

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public String getShopname()
    {
        if (getSeller()!=null)
            return getSeller().getFullName();
        return null;
    }
}

