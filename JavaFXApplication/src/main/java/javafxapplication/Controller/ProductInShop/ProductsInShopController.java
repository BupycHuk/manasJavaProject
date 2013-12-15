package javafxapplication.Controller.ProductInShop;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxapplication.Model.ProductInShop;
import javafxapplication.Model.*;
import javafxapplication.Proxy.ProductInShopProxy;
import javafxapplication.Proxy.ShopProxy;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class ProductsInShopController implements Initializable {
    public TableView tableView1;
    public TableColumn shopName;
    public TableColumn providerName;
    public TableColumn productName;
    public ComboBox shopComboBox;
    ShopProxy shopProxy = new ShopProxy();
    ProductInShopProxy productInShopProxy =new ProductInShopProxy();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Shop[] shops = shopProxy.getShops();
        shopComboBox.getItems().setAll(shops);
        shopName.setCellValueFactory(new PropertyValueFactory<ProductInShop, String>("shop"));
        providerName.setCellValueFactory(new PropertyValueFactory<ProductInShop, String>("name"));
        productName.setCellValueFactory(new PropertyValueFactory<ProductInShop, String>("product"));
    }

    public void textToluktoo(ActionEvent actionEvent) {
        Shop shop = (Shop) shopComboBox.getValue();
        long shopId = shop.getId();

        List<ProductInShop> productInShops = Arrays.asList(productInShopProxy.getProductInShops(shopId));
        tableView1.getItems().setAll(productInShops);
    }
}
