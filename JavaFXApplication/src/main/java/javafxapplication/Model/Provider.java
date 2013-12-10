package javafxapplication.Model;

/**
 * Created by Admin on 10.12.13.
 */
public class Provider {


    private long id;
    private String name;
    private String contacts;
    protected Provider() {}

    public Provider(String firstName, String contacts) {
        this.name = firstName;
        this.contacts = contacts;
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

    public void setId(long id) {
        this.id = id;
    }
}
