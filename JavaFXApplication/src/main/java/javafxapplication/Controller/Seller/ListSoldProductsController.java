package javafxapplication.Controller.Seller;

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

/**
 *
 * @author Akim
 */
public class ListSoldProductsController implements Initializable {

    public TableColumn<SoldProducts, String> sellerName;
    public TableColumn<SoldProducts, String> buyumAty;
    public TableColumn<SoldProducts, String> buyumSany;
    public TableView<SoldProducts> tableView2;

    SoldProductsProxy soldProductsProxy = new SoldProductsProxy();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        sellerName.setCellValueFactory(new PropertyValueFactory<SoldProducts, String>("sellerName"));
        buyumAty.setCellValueFactory(new PropertyValueFactory<SoldProducts, String>("buyumAty"));
        buyumSany.setCellValueFactory(new PropertyValueFactory<SoldProducts, String>("buyumSany"));
    }

    public void tolukta(ActionEvent actionEvent) {
        List<SoldProducts> productsList = Arrays.asList(soldProductsProxy.getSoldProSductss());

        tableView2.getItems().setAll(productsList);
    }
}
