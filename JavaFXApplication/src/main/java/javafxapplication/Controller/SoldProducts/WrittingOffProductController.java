package javafxapplication.Controller.SoldProducts;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafxapplication.Model.Product;
import javafxapplication.Model.RequestDto.WrittingOffProductRequest;
import javafxapplication.Proxy.ProductProxy;
import javafxapplication.Proxy.SellerProxy;
import javafxapplication.Proxy.SoldProductsProxy;


import java.net.URL;
import java.util.ResourceBundle;

public class WrittingOffProductController implements Initializable {

    public ComboBox productComboBox;
    @FXML
    private TextField text3;

    SoldProductsProxy soldProductsProxy = new SoldProductsProxy();
    ProductProxy productProxy = new ProductProxy();
    SellerProxy sellerProxy = new SellerProxy();

    @FXML
    private void handleButtonAction(ActionEvent event) {

        Product product = (Product)productComboBox.getValue();
        long productId = (product!=null)? (long) product.getId() :0;

        WrittingOffProductRequest request = new WrittingOffProductRequest(productId);

        soldProductsProxy.writtingOffProduct(request);
    }
    @FXML
    private void textTazala(ActionEvent event){
        text3.setText("");
        productComboBox.setValue(null);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Product[] products = productProxy.getProducts();
        productComboBox.getItems().setAll(products);
    }
}
