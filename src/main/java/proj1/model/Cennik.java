package proj1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cennik {
    @Id
    @GeneratedValue
    private int id;
    private double cena;
    private String usługa;



    public String getUsługa() {
        return usługa;
    }

    public void setUsługa(String usługa) {
        this.usługa = usługa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }


    @Override
    public String toString() {
        return "Cennik{" +
                "id=" + id +
                ", cena=" + cena +
                ", usługa='" + usługa + '\'' +
                '}';
    }

    public Cennik(double cena) {
        this.cena = cena;
    }

    public Cennik(double cena, String usługa) {
        this.cena = cena;
        this.usługa = usługa;
    }

    public Cennik() {
    }
}
