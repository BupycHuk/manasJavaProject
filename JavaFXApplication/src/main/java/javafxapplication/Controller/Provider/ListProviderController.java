package javafxapplication.Controller.Provider;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxapplication.Model.Provider;
import javafxapplication.Proxy.ProviderProxy;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

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

    public void deleteProvider(ActionEvent actionEvent) {


        Provider provider =  (Provider) tableView1.getSelectionModel().getSelectedItem();
        long id = provider.getId();
        providerProxy.providerDelete(id);

    }

}
