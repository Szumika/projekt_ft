package proj1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Przystanek {
@Id
@GeneratedValue
private long id;
private String miejscowosc;
private String nazwaPrzystanku;
private String trasa;

    public String getTrasa() {
        return trasa;
    }

    public void setTrasa(String trasa) {
        this.trasa = trasa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public Przystanek(String miejscowosc, String nazwaPrzystanku, String trasa) {
        this.miejscowosc = miejscowosc;
        this.nazwaPrzystanku = nazwaPrzystanku;
        this.trasa = trasa;
    }

    @Override
    public String toString() {
        return "Przystanek{" +
                "id=" + id +
                ", miejscowosc='" + miejscowosc + '\'' +
                ", nazwaPrzystanku='" + nazwaPrzystanku + '\'' +
                ", trasa='" + trasa + '\'' +
                '}';
    }

}
