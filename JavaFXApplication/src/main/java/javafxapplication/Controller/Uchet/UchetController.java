package javafxapplication.Controller.Uchet;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafxapplication.Model.*;
import javafx.fxml.Initializable;
import javafxapplication.Model.RequestDto.*;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafxapplication.Model.Shop;
import javafxapplication.Proxy.ProductInShopProxy;
import javafxapplication.Proxy.ProductProxy;
import javafxapplication.Proxy.ProviderProxy;
import javafxapplication.Proxy.ShopProxy;


import java.net.URL;
import java.util.ResourceBundle;

public class UchetController implements Initializable{

    public ComboBox shopComboBox;
    @FXML
    public ComboBox productComboBox;
    @FXML
    public ComboBox providerComboBox;

    public TextField productNameText;
    public TextField countProduct;
    public TextField priceProduct;

    ProviderProxy providerProxy = new ProviderProxy();
    ProductProxy productProxy = new ProductProxy();
    ProductInShopProxy productInShopProxy = new ProductInShopProxy();
    ShopProxy shopProxy = new ShopProxy();


    @FXML
    private void handleButtonAction(ActionEvent event) {
        Integer price, count;

        Shop shop = (Shop)shopComboBox.getValue();
        Long shopId = (shop!=null)? (Long)shop.getId() :0;

        Provider provider = (Provider)providerComboBox.getValue();
        Long providerId = (Long)provider.getId();

        Product product = (Product)productComboBox.getValue();
        Long productId = (product!=null)?(Long)product.getId():0;

        price = Integer.parseInt(priceProduct.getText());
        count = Integer.parseInt(countProduct.getText());

        AddProductInShopRequest request = new AddProductInShopRequest(count,shopId,providerId,productId);
        productInShopProxy.addProductInShop(request);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Shop[] shops = shopProxy.getShops();
        shopComboBox.getItems().setAll(shops);

        Provider[] providers = providerProxy.getProviders();
        providerComboBox.getItems().setAll(providers);

        Product[] products = productProxy.getRProducts();
        productComboBox.getItems().setAll(products);

    }
}
