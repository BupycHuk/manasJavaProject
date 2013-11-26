package javafxapplication.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafxapplication.Model.PostExample;
import javafxapplication.Model.Seller;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

/**
 *
 * @author Akim
 */
public class FXMLDocumentController implements Initializable {

    public TableColumn shopName;
    public TableColumn name;
    public TableColumn Login;
    public TableView tableView1;
    //public Button tazala;
    @FXML
    private Label label;
    @FXML
    private TextField text1;
    @FXML
    private TextField text2;
    @FXML
    private TextField text3;
    @FXML
    private PasswordField text4;

    RestTemplate restTemplate = new RestTemplate();
    @FXML
    private void handleButtonAction(ActionEvent event) {

        String shopName, sellerName, login, password;
        shopName=text1.getText();
        sellerName=text2.getText();
        login=text3.getText();
        password=text4.getText();

        PostExample postExample = new PostExample(shopName, sellerName,login,password);

        String url = "http://localhost:8080/addSeller/";
        Seller seller = restTemplate.postForObject(url, postExample, Seller.class);

        //JOptionPane.showMessageDialog(null, shopName +"дүкөнүнө жаңы сатуучу кошулду");
        Toluktoo();
    }
    @FXML
    private void textTazala(ActionEvent event){
    text1.setText("");
    text2.setText("");
    text3.setText("");
    text4.setText("");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO


        List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();

//Add the Jackson Message converter
        messageConverters.add(new MappingJacksonHttpMessageConverter());

//Add the message converters to the restTemplate
        restTemplate.setMessageConverters(messageConverters);
    }

    public void textTolukta(ActionEvent actionEvent) {
        Toluktoo();
    }

    private void Toluktoo() {

        List<Seller> sellers = Arrays.asList(restTemplate.getForObject("http://localhost:8080/sellers/", Seller[].class));
        shopName.setCellValueFactory(new PropertyValueFactory<Seller, String>("shopname"));
        name.setCellValueFactory(new PropertyValueFactory<Seller, String>("fullName"));
        Login.setCellValueFactory(new PropertyValueFactory<Seller, String>("login"));

        tableView1.getItems().setAll(sellers);
    }
}
