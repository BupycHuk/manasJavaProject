package javafxapplication.Controller.ProductsInShop;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxapplication.Model.ProductsInShop;
import javafxapplication.Model.SoldProducts;
import javafxapplication.Proxy.ProductsInShopProxy;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public  class ListProductsController implements Initializable {

    public TableColumn productName;
    public TableColumn productPrice;
    public TableColumn productCount;
    public TableColumn shopName;
    public TableColumn providerName;
    public TableView tableView2;

    ProductsInShopProxy productsInShopProxy = new ProductsInShopProxy();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        productName.setCellValueFactory(new PropertyValueFactory<ProductsInShop, String>("nameProduct"));
        productPrice.setCellValueFactory(new PropertyValueFactory<ProductsInShop, String>("priceProduct"));
        productCount.setCellValueFactory(new PropertyValueFactory<ProductsInShop, String>("count"));
        providerName.setCellValueFactory(new PropertyValueFactory<ProductsInShop, String>("nameProvider"));
        shopName.setCellValueFactory(new PropertyValueFactory<ProductsInShop, String>("shop"));
    }

    public void textTolukta(ActionEvent actionEvent) {
        List<ProductsInShop> productsInShops = Arrays.asList(productsInShopProxy.getProductsInfo());

        tableView2.getItems().setAll(productsInShops);
    }
}
