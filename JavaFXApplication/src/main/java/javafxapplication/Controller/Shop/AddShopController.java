package javafxapplication.Controller.Shop;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafxapplication.Model.RequestDto.*;
import javafxapplication.Proxy.ShopProxy;

import java.net.URL;
import java.util.ResourceBundle;

public class AddShopController implements Initializable {
    public TextField shopName;
    public TextField shopContact;
    ShopProxy shopProxy = new ShopProxy();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void ButtonAction(ActionEvent actionEvent) {
        String name, contact;
        name = shopName.getText();
        contact = shopContact.getText();

        AddShopRequest addShopRequest = new AddShopRequest(name,contact);
        shopProxy.addShop(addShopRequest);
        shopName.setText("");
        shopContact.setText("");
    }
}
