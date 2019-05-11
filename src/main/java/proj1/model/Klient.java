package proj1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Klient {
@Id
@GeneratedValue
private int id;
private String imie;
private String nazwisko;
private String nrTelefonu;
private int iloscPkt;
private String email;
private double znizka;

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

    public String getNrTelefonu() {
        return nrTelefonu;
    }

    public void setNrTelefonu(String nrTelefonu) {
        this.nrTelefonu = nrTelefonu;
    }

    public int getIloscPkt() {
        return iloscPkt;
    }

    public void setIloscPkt(int iloscPkt) {
        this.iloscPkt = iloscPkt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getZnizka() {
        return znizka;
    }

    public Klient() {
    }

    public void setZnizka(double znizka) {
        this.znizka = znizka;
    }

    public Klient(String imie, String nazwisko, String nrTelefonu, int iloscPkt, String email, double znizka) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrTelefonu = nrTelefonu;
        this.iloscPkt = iloscPkt;
        this.email = email;
        this.znizka = znizka;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", nrTelefonu='" + nrTelefonu + '\'' +
                ", iloscPkt=" + iloscPkt +
                ", email='" + email + '\'' +
                ", znizka=" + znizka +
                '}';
    }
}
