package hello.Model.RequestDto;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 25.11.13
 * Time: 13:36
 * To change this template use File | Settings | File Templates.
 */
public class BuyumSatuuRequest implements Serializable {
    private long satuuchuId;
    private String buyumAty;
    private String satylganSany;

    public BuyumSatuuRequest()
    {

    }

    public BuyumSatuuRequest(long satuuchuId, String buyumAty, String satylganSany) {
        //To change body of created methods use File | Settings | File Templates.
        this.satuuchuId = satuuchuId;
        this.buyumAty = buyumAty;
        this.satylganSany = satylganSany;
    }

    public long getSatuuchuId() {
        return satuuchuId;
    }

    public void setSatuuchuId(long satuuchuId)
    {
        this.satuuchuId = satuuchuId;
    }

    public String getBuyumAty() {
        return buyumAty;
    }

    public void setBuyumAty(String buyumAty)
    {
        this.buyumAty = buyumAty;
    }


    public String getSatylganSany() {
        return satylganSany;
    }

    public void setSatylganSany(String satylganSany)
    {
        this.satylganSany = satylganSany;
    }

}
