package javafxapplication.Controller.Seller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafxapplication.Model.RequestDto.BuyumSatuuRequest;
import javafxapplication.Model.Shop;
import javafxapplication.Model.Seller;
import javafxapplication.Model.ForSeller;
import javafxapplication.Proxy.BuyumSatuuProxy;
import javafxapplication.Proxy.SellerProxy;
import javafxapplication.Proxy.ForSellerProxy;
import javafxapplication.Proxy.ShopProxy;

import java.net.URL;
import java.util.ResourceBundle;

/**
 *
 * @author Akim
 */
public class BuyumSatuuController implements Initializable {

    public ComboBox satuuchuComboBox;
    @FXML
    private TextField buyumAty;
    @FXML
    private TextField buyumSany;

    BuyumSatuuProxy buyumSatuuProxy = new BuyumSatuuProxy();
    SellerProxy sellerProxy = new SellerProxy();

    @FXML
    private void handleButtonAction(ActionEvent event) {

        String buyumdunAty, satylganSany;
        ForSeller forSeller = (ForSeller) satuuchuComboBox.getValue();
        long satuuchuId  =(forSeller!=null)? (long) forSeller.getId() :0;
        buyumdunAty= buyumAty.getText();
        satylganSany= buyumSany.getText();

        BuyumSatuuRequest request = new BuyumSatuuRequest(satuuchuId, buyumdunAty,satylganSany);
        buyumSatuuProxy.buyumSatuu(request);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Seller[] seller = sellerProxy.getSellers();
        satuuchuComboBox.getItems().setAll(seller);
    }
}