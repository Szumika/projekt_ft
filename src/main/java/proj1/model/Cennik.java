package proj1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cennik {
    @Id
    @GeneratedValue
    private long id;
    private String cena;
    private String usługa;



    public String getUsługa() {
        return usługa;
    }

    public void setUsługa(String usługa) {
        this.usługa = usługa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCena() {
        return cena;
    }

    public void setCena(String cena) {
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

    public Cennik(String cena) {
        this.cena = cena;
    }

    public Cennik(String cena, String usługa) {
        this.cena = cena;
        this.usługa = usługa;
    }

    public Cennik() {
    }
}
