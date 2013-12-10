package javafxapplication.Model.RequestDto;

import java.io.Serializable;

public class AddProviderRequest implements Serializable {
    private String name;
    private String contacts;

    public AddProviderRequest()
    {

    }

    public AddProviderRequest( String name, String contacts) {
        //To change body of created methods use File | Settings | File Templates.
        this.name = name;
        this.contacts = contacts;
    }



    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts)
    {
        this.contacts = contacts;
    }

}
