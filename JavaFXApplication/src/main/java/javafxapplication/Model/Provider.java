package javafxapplication.Model;

public class Provider {
    private long id;
    private String name;
    private String contacts;

    protected Provider() {}

    public Provider(String name, String contacts) {
        this.name = name;
        this.contacts = contacts;
    }

    public long getId() {
        return id;
    }
    public void setId(long Id)
    {
        this.id = Id;
    }

    public String getContacts() {
        return contacts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }
}
