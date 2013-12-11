package javafxapplication.Controller.Seller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxapplication.Model.Seller;
import javafxapplication.Model.ForSeller;
import javafxapplication.Proxy.SellerProxy;
import javafxapplication.Proxy.ForSellerProxy;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

/**
 *
 * @author Akim
 */
public class ListSoldProductSellerController implements Initializable {

    public TableColumn sellerName;
    public TableColumn buyumAty;
    public TableColumn satylganSany;
    public TableView tableView2;

    ForSellerProxy forSellerProxy = new ForSellerProxy();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        sellerName.setCellValueFactory(new PropertyValueFactory<ForSeller, String>("sellerName"));
        buyumAty.setCellValueFactory(new PropertyValueFactory<ForSeller, String>("buyumAty"));
        satylganSany.setCellValueFactory(new PropertyValueFactory<ForSeller, String>("satylganSany"));
    }

    public void textTolukta(ActionEvent actionEvent) {
        List<ForSeller> forSellers = Arrays.asList(forSellerProxy.getForSellers());
        tableView2.getItems().setAll(forSellers);
    }
}
