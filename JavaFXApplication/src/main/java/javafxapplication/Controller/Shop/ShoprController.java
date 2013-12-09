package javafxapplication.Controller.Shop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafxapplication.Model.RequestDto.AddSellerRequest;
import javafxapplication.Model.Shop;
import javafxapplication.Proxy.SellerProxy;
import javafxapplication.Proxy.ShopProxy;

import java.net.URL;
import java.util.ResourceBundle;

/**
 *
 *
 */
public class ShoprController implements Initializable {


    public ComboBox shopComboBox;
    SellerProxy sellerProxy = new SellerProxy();
    ShopProxy shopProxy = new ShopProxy();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Shop[] shops = shopProxy.getShops();
        shopComboBox.getItems().setAll(shops);
    }

    public void handleButtonAction(ActionEvent actionEvent) {

    }
}
