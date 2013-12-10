package hello.Model.RequestDto;

import java.io.Serializable;

public class AddProviderRequest implements Serializable {

    private String contacts;
    private String name;

    public AddProviderRequest()
    {

    }

    public AddProviderRequest( String name, String contacts) {
        //To change body of created methods use File | Settings | File Templates.
        this.contacts = name;
        this.name = contacts;
    }



    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts)
    {
        this.contacts = contacts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

}
