package javafxapplication.Controller.Provider;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxapplication.Model.Provider;
import javafxapplication.Model.Seller;
import javafxapplication.Proxy.ProviderProxy;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
/**
 * Created by Admin on 10.12.13.
 */
public class ListProviderController implements Initializable{

    public TableColumn name;
    public TableColumn contacts;
    public TableView tableView1;

    ProviderProxy providerProxy = new ProviderProxy();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        name.setCellValueFactory(new PropertyValueFactory<Provider, String>("name"));
        contacts.setCellValueFactory(new PropertyValueFactory<Provider, String>("contacts"));
    }

    public void textTolukta(ActionEvent actionEvent) {
        List<Provider> providers = Arrays.asList(providerProxy.getProviders());

        tableView1.getItems().setAll(providers);
    }
}
