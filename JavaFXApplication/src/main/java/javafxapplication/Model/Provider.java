package javafxapplication.Model;

public class Provider{

    private long id;
    private String name;
    private String contacts;

    protected Provider() {}

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

    public String toString(){
        return getId()+" - "+getName();
    }
}
