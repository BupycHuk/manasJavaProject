package javafxapplication.Model;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 10.12.13
 * Time: 15:34
 * To change this template use File | Settings | File Templates.
 */
public class Provider {
    private long id;
    private String name;
    private String contacts;

    protected Provider() {}

    public Provider(String name, String contacts) {
        this.name = name;
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
