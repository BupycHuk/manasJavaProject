package javafxapplication.Model.RequestDto;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 25.11.13
 * Time: 13:36
 * To change this template use File | Settings | File Templates.
 */
public class BuyumSatuuRequest implements Serializable {
    private long sellerId;
    private String buyumAty;
    private String buyumSany;

    public BuyumSatuuRequest()
    {

    }

    public BuyumSatuuRequest(long sellerId, String buyumAty, String buyumSany) {
        //To change body of created methods use File | Settings | File Templates.
        this.sellerId = sellerId;
        this.buyumAty = buyumAty;
        this.buyumSany = buyumSany;
    }

    public long getSellerId() {
        return sellerId;
    }

    public void setShopId(long sellerId)
    {
        this.sellerId =sellerId;
    }

    public String getBuyumAty() {
        return buyumAty;
    }

    public void setBuyumAty(String buyumAty)
    {
        this.buyumAty=buyumAty;
    }


    public String getBuyumSany() {
        return buyumSany;
    }

    public void setBuyumSany(String buyumSany)
    {
        this.buyumSany = buyumSany;
    }

}
