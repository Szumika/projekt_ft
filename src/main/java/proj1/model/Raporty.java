package proj1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Raporty {
@Id
@GeneratedValue
private int id;
private String kierowcy;
private String pojazdy;
private String rezerwacje;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getPojazdy() {
        return pojazdy;
    }

    public void setPojazdy(String pojazdy) {
        this.pojazdy = pojazdy;
    }

    public String getRezerwacje() {
        return rezerwacje;
    }

    public void setRezerwacje(String rezerwacje) {
        this.rezerwacje = rezerwacje;
    }

    public Raporty() {
    }

    public Raporty(String kierowcy, String pojazdy, String rezerwacje) {
        this.kierowcy = kierowcy;
        this.pojazdy = pojazdy;
        this.rezerwacje = rezerwacje;
    }

    @Override
    public String toString() {
        return "Raporty{" +
                "id=" + id +
                ", kierowcy='" + kierowcy + '\'' +
                ", pojazdy=" + pojazdy +
                ", rezerwacje=" + rezerwacje +
                '}';
    }
}
