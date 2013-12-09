package javafxapplication.Controller.Uchet;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafxapplication.Model.Shop;
import javafxapplication.Proxy.ShopProxy;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Нурсултан on 08.12.13.
 */
public class UchetController implements Initializable{

    public ComboBox shopComboBox;
    @FXML
    public ComboBox productComboBox;
    @FXML
    public ComboBox providerComboBox;
    @FXML
    private TextField text2;
    @FXML
    private TextField text3;



    ShopProxy shopProxy = new ShopProxy();

    @FXML
    private void handleButtonAction(ActionEvent event) {

        String sellerName, login, password;
        Shop shop = (Shop)shopComboBox.getValue();
        long shopId = (shop!=null)? (long) shop.getId() :0;
        sellerName=text2.getText();
        login=text3.getText();

    }
    @FXML
    private void textTazala(ActionEvent event){
        text2.setText("");
        text3.setText("");

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Shop[] shops = shopProxy.getShops();
        shopComboBox.getItems().setAll(shops);
    }
}
