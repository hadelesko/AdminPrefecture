package models;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
public class Person {
    private String name;
    private String prenom;
    private String date;
    private long id;
    @Embedded
    private ContactAddress contactAddress;

    public Person(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ContactAddress getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(ContactAddress contactAddress) {
        this.contactAddress = contactAddress;
    }
}
