package javafxapplication.Controller.Provider;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxapplication.Model.Provider;
import javafxapplication.Proxy.ProviderProxy;


import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created with IntelliJ IDEA.
 * User: nurgul-pc
 * Date: 12/9/13
 * Time: 3:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class ListProviderController implements Initializable {
    public TableColumn name;
    public TableColumn contacts;
    public TableView tableView2;
    public TableColumn id;

    ProviderProxy providerProxy = new ProviderProxy();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        id.setCellValueFactory(new PropertyValueFactory<Provider, Long>("id"));
        name.setCellValueFactory(new PropertyValueFactory<Provider, String>("name"));
        contacts.setCellValueFactory(new PropertyValueFactory<Provider, String>("contacts"));
    }

    public void textTolukta(ActionEvent actionEvent) {
        List<Provider> providers = Arrays.asList(providerProxy.getProviders());

        tableView2.getItems().setAll(providers);
    }
}
