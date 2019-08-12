package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class GestionPrefecture {

    @Id
    @GeneratedValue
    private  int id;
    private  String name;
    private  String prefet;

    public GestionPrefecture(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrefet() {
        return prefet;
    }

    public void setPrefet(String prefet) {
        this.prefet = prefet;
    }
}
