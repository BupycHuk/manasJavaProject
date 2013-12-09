package hello.Model;

import javax.persistence.*;

@Entity
public class Shop
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @Column(name="name")
    private String name;

    @Column(name="contacts")
    private String contacts;
    protected Shop() {}

    public Shop(String name, String contacts) {
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
