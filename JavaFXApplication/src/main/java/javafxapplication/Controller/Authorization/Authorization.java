package javafxapplication.Controller.Authorization;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafxapplication.Model.Seller;
import javafxapplication.Proxy.SellerProxy;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class Authorization implements Initializable {
    public VBox vbox;

    public TextField password;
    public TextField login;
    Seller var;
    SellerProxy sellerProxy = new SellerProxy();
List<Seller> sellers = Arrays.asList(sellerProxy.getSellers());

    public void kiruu(ActionEvent actionEvent) throws IOException {
//        for ()
        if (login.getText().equals(var.getLogin()) && password.getText().equals(var.getPassword())) {
            Parent root = FXMLLoader.load(getClass().getResource("/View/MainWindow.fxml"));
            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            Node node = (Node) actionEvent.getSource();
            node.getScene();
            }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
