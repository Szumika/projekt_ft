package proj1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pracownicy {
@Id
@GeneratedValue
private int id;
private String imie;
private  String nazwisko;
private  String stanowisko;
@OneToOne
private Pojazd pojazd;
@OneToOne
private Raporty raport;
@OneToOne
private Nagrody nagrody;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public Pojazd getPojazd() {
        return pojazd;
    }

    public void setPojazd(Pojazd pojazd) {
        this.pojazd = pojazd;
    }

    public Raporty getRaport() {
        return raport;
    }

    public void setRaport(Raporty raport) {
        this.raport = raport;
    }

    public Nagrody getNagrody() {
        return nagrody;
    }

    public void setNagrody(Nagrody nagrody) {
        this.nagrody = nagrody;
    }

    @Override
    public String toString() {
        return "Pracownicy{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", stanowisko='" + stanowisko + '\'' +
                ", pojazd=" + pojazd +
                ", raport=" + raport +
                ", nagrody=" + nagrody +
                '}';
    }

    public Pracownicy() {
    }

    public Pracownicy(String imie, String nazwisko, String stanowisko, Pojazd pojazd, Raporty raport, Nagrody nagrody) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
        this.pojazd = pojazd;
        this.raport = raport;
        this.nagrody = nagrody;
    }
}
