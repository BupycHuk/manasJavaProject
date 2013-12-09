package hello.Model;

import javax.persistence.*;
import java.util.Iterator;

@Entity
public class Shop implements Iterable<ProductsInShop> {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @Column(name="name")
    private String name;

    @Column(name="contacts")
    private String contacts;

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

    @Override
    public Iterator<ProductsInShop> iterator() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
