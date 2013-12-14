package javafxapplication.Controller.SoldProducts;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxapplication.Model.SoldProducts;
import javafxapplication.Proxy.SoldProductsProxy;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public  class ListSoldProductsController implements Initializable {

    public TableColumn productName;
    public TableColumn productPrice;
    public TableColumn productCount;
    public TableColumn sellerName;
    public TableView tableView3;
//    public TableColumn price;
//    public TableColumn count;

    SoldProductsProxy soldProductsProxy = new SoldProductsProxy();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        productName.setCellValueFactory(new PropertyValueFactory<SoldProducts, String>("product"));
        productPrice.setCellValueFactory(new PropertyValueFactory<SoldProducts, String>("price"));
        productCount.setCellValueFactory(new PropertyValueFactory<SoldProducts, String>("count"));
        sellerName.setCellValueFactory(new PropertyValueFactory<SoldProducts, String>("seller"));
    }

    public void textTolukta(ActionEvent actionEvent) {
        List<SoldProducts> soldProducts = Arrays.asList(soldProductsProxy.getSoldProductsInfo());

        tableView3.getItems().setAll(soldProducts);
    }
}
