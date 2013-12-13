package javafxapplication.Controller.Seller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafxapplication.Model.RequestDto.AddSellerRequest;
import javafxapplication.Model.RequestDto.BuyumSatuuRequest;
import javafxapplication.Model.Seller;
import javafxapplication.Proxy.SellerProxy;
import javafxapplication.Proxy.SoldProductsProxy;
import javafxapplication.Proxy.ShopProxy;

import java.net.URL;
import java.util.ResourceBundle;

/**
 *
 * @author Akim
 */
public class BuyumSatuuController implements Initializable {

    public ComboBox satuuchuAtyComboBox;
    @FXML
    private TextField buyumAty;
    @FXML
    private TextField buyumSany;

    SellerProxy sellerProxy = new SellerProxy();
    ShopProxy shopProxy = new ShopProxy();
    SoldProductsProxy soldProductsProxy = new SoldProductsProxy();

    @FXML
    private void handleButtonAction(ActionEvent event) {

        String buyumAty, buyumSany;
        Seller seller = (Seller)satuuchuAtyComboBox.getValue();
        long sellerId = (seller!=null)? (long) seller.getId() :0;
        buyumAty= this.buyumAty.getText();
        buyumSany= this.buyumSany.getText();

        BuyumSatuuRequest request = new BuyumSatuuRequest(sellerId, buyumAty,buyumSany);

        soldProductsProxy.soldProduct(request);
    }
//    @FXML
//    private void textTazala(ActionEvent event){
//    buyumAty.setText("");
//    buyumSany.setText("");
//    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Seller[] sellers = sellerProxy.getSellers();
        satuuchuAtyComboBox.getItems().setAll(sellers);
    }
}
