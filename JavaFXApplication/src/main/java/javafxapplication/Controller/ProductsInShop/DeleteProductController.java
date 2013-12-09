package javafxapplication.Controller.ProductsInShop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafxapplication.Model.ProductsInShop;
import javafxapplication.Model.RequestDto.AddSellerRequest;
import javafxapplication.Model.Shop;
import javafxapplication.Proxy.ProductsInShopProxy;
import javafxapplication.Proxy.SellerProxy;
import javafxapplication.Proxy.ShopProxy;

import java.net.URL;
import java.util.ResourceBundle;

/**
*
* @author Akim
*/
public class DeleteProductController implements Initializable {

//    public ComboBox shopComboBox;
    public ComboBox soldProductsComboBox;
//    @FXML
//    private TextField text2;
    @FXML
    private TextField text3;
//    @FXML
    private PasswordField text4;

    ProductsInShop productsInShop = new ProductsInShop();
//    ShopProxy shopProxy = new ShopProxy();

    @FXML
    private void handleButtonAction(ActionEvent event) {

        String sellerName, login, password;
        ProductsInShop productsInShop =(ProductsInShop)soldProductsComboBox.getValue();
        //Shop shop = (Shop)shopComboBox.getValue();
        //long shopId = (shop!=null)? (long) shop.getId() :0;
        long productId = (productsInShop!=null)? (long) productsInShop.getId() :0;
//        sellerName=text2.getText();
        login=text3.getText();
        password=text4.getText();

//        AddSellerRequest request = new AddSellerRequest(shopId, sellerName,login,password);

//        productsInShop.addSeller(request);
    }
    @FXML
    private void textTazala(ActionEvent event){
//    text2.setText("");
    text3.setText("");
    text4.setText("");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
//        //To change body of implemented methods use File | Settings | File Templates.
//    }
//    @Override
//    public void initialize(URL url, ResourceBundle rb) {
//        ProductsInShop[] productsInShop = ProductsInShopProxy.getShops();
//        soldProductsComboBox.getItems().setAll(soldProducts);
//    }
}
