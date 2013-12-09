package javafxapplication.Controller.Product;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxapplication.Model.Product;
import javafxapplication.Proxy.ProductProxy;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by Aza on 08.12.13.
 */
public class ListProductController implements Initializable {

    public TableColumn shopName;
    public TableColumn nameProduct;
    public TableColumn price;
    public TableView tableView2;

    ProductProxy productProxy = new ProductProxy();


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        shopName.setCellValueFactory(new PropertyValueFactory<Product, String>("shopname"));
        nameProduct.setCellValueFactory(new PropertyValueFactory<Product, String>("nameProduct"));
        price.setCellValueFactory(new PropertyValueFactory<Product, String>("price"));
    }

    public void textTolukta(ActionEvent actionEvent) {
        List<Product> products = Arrays.asList(productProxy.getProducts());

        tableView2.getItems().setAll(products);
    }

//    public void delete(ActionEvent actionEvent) {
//
//        List<Product> products = Arrays.asList(productProxy.deleteProduct());
//
//    }
}
