package javafxapplication.Controller.Provider;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafxapplication.Model.RequestDto.*;
import javafxapplication.Proxy.ProviderProxy;

import java.net.URL;
import java.util.ResourceBundle;

public class AddProviderController implements Initializable {
    public TextField providerName;
    public TextField providerContact;
    ProviderProxy providerProxy = new ProviderProxy();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void ButtonAction(ActionEvent actionEvent) {
        String name, contact;
        name=providerName.getText();
        contact=providerContact.getText();

        AddProviderRequest addProviderRequest = new AddProviderRequest(name,contact);
        providerProxy.addProvider(addProviderRequest);
        providerName.setText("");
        providerContact.setText("");
    }
}
