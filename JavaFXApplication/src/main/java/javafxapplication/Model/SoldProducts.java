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

public class SoldProducts {
    private long id;
    private String buyumAty;
    private String buyumSany;

    protected SoldProducts() {}

    public SoldProducts(String buyumAty, String buyumSany) {
        this.buyumAty = buyumAty;
        this.buyumSany = buyumSany;
    }


    public String getBuyumAty() {
        return buyumAty;
    }

    public void setBuyumAty(String buyumAty) {
        this.buyumAty = buyumAty;
    }

    public String getBuyumSany() {
        return buyumSany;
    }

    public void setBuyumSany(String buyumSany) {
        this.buyumSany = buyumSany;
    }

    public long getId() {
        return id;
    }
    public void setId(long Id)
    {
        this.id = Id;
    }

//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }

    private Seller seller;

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public String getSellername()
    {
        if (getSeller()!=null)
            return getSeller().getFullName();
        return null;
    }
}

