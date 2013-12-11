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
 * Created by Admin on 10.12.13.
 */
public class ListProductController implements Initializable {

    public TableColumn nameProduct;
    public TableColumn price;
    public TableColumn sold;
    public TableView tableView1;


    ProductProxy productProxy = new ProductProxy();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Product isSold = new Product();

        nameProduct.setCellValueFactory(new PropertyValueFactory<Product, String>("nameProduct"));
        price.setCellValueFactory(new PropertyValueFactory<Product, String>("price"));
        sold.setCellValueFactory(new PropertyValueFactory<Product, String>("sold"));

    }

    public void textTolukta(ActionEvent actionEvent) {
        List<Product> products = Arrays.asList(productProxy.getProducts());

        tableView1.getItems().setAll(products);
    }
}
