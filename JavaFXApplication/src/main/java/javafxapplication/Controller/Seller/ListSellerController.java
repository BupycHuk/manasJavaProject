package javafxapplication.Controller.Seller;

import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.event.ActionEvent;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxapplication.Model.Seller;
import javafxapplication.Proxy.SellerProxy;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
public class ListSellerController implements Initializable {

    public TableColumn shopName;
    public TableColumn name;
    public TableColumn Login;
    public TableView tableView1;

    SellerProxy sellerProxy = new SellerProxy();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        shopName.setCellValueFactory(new PropertyValueFactory<Seller, String>("shopname"));
        name.setCellValueFactory(new PropertyValueFactory<Seller, String>("fullName"));
        Login.setCellValueFactory(new PropertyValueFactory<Seller, String>("login"));
    }

    public void textTolukta(ActionEvent actionEvent) {
        List<Seller> sellers = Arrays.asList(sellerProxy.getSellers());


        tableView1.getItems().setAll(sellers);
    }
  
    
}
