package javafxapplication.Controller.Seller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxapplication.Model.Seller;
import javafxapplication.Proxy.SellerProxy;
import org.springframework.beans.propertyeditors.ResourceBundleEditor;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

/**
 *
 * @author Akim
 */
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

    public void deleteSeller(ActionEvent actionEvent){

        Seller seller = (Seller) tableView1.getSelectionModel().getSelectedItem();
        long id = seller.getId();
        sellerProxy.deleteSellerById(id);
    }
}
