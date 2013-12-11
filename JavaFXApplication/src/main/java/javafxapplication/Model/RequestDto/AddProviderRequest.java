package javafxapplication.Model.RequestDto;

/**
 * Created by Imanali on 12/11/13.
 */
public class AddProviderRequest {
    private long id;
    private String name;
    private String contacts;

    protected AddProviderRequest() {}

    public AddProviderRequest(String firstName, String lastName) {
        this.name = firstName;
        this.contacts = lastName;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public long getId() {
        return id;
    }
}
