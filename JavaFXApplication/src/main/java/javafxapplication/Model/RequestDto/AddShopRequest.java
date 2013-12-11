package javafxapplication.Model.RequestDto;

import java.io.Serializable;

/**
 * Created by Imanali on 12/11/13.
 */
public class AddShopRequest implements Serializable {
    private long id;
    private String name;
    private String contacts;

    protected AddShopRequest(){}

    public AddShopRequest(String name, String contacts){

        this.name = name;
        this.contacts = contacts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }
}
