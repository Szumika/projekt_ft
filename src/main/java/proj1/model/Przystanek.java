package proj1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Przystanek {
@Id
@GeneratedValue
private int id;
private String miejscowosc;
private String nazwaPrzystanku;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    public String getNazwaPrzystanku() {
        return nazwaPrzystanku;
    }

    public void setNazwaPrzystanku(String nazwaPrzystanku) {
        this.nazwaPrzystanku = nazwaPrzystanku;
    }

    public Przystanek() {
    }

    public Przystanek(String miejscowosc, String nazwaPrzystanku) {
        this.miejscowosc = miejscowosc;
        this.nazwaPrzystanku = nazwaPrzystanku;
    }

    @Override
    public String toString() {
        return "Przystanek{" +
                "id=" + id +
                ", miejscowosc='" + miejscowosc + '\'' +
                ", nazwaPrzystanku='" + nazwaPrzystanku + '\'' +
                '}';
    }
}
