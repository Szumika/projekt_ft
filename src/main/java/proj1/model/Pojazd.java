package proj1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Pojazd {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double iloscKM;
    private int iloscMiejsc;
    private String marka;
    private String miejsceParkingowe;
    private String model;
    private String numerPojazdu;
    private double srednieZuzyciePaliwa;

    public long getId() {
        return id;
    }

    public double getIloscKM() {
        return iloscKM;
    }

    public int getIloscMiejsc() {
        return iloscMiejsc;
    }

    public String getMarka() {
        return marka;
    }

    public String getMiejsceParkingowe() {
        return miejsceParkingowe;
    }

    public String getModel() {
        return model;
    }

    public String getNumerPojazdu() {
        return numerPojazdu;
    }

    public double getSrednieZuzyciePaliwa() {
        return srednieZuzyciePaliwa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIloscKM(double iloscKM) {
        this.iloscKM = iloscKM;
    }

    public void setIloscMiejsc(int iloscMiejsc) {
        this.iloscMiejsc = iloscMiejsc;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setMiejsceParkingowe(String miejsceParkingowe) {
        this.miejsceParkingowe = miejsceParkingowe;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumerPojazdu(String numerPojazdu) {
        this.numerPojazdu = numerPojazdu;
    }

    public void setSrednieZuzyciePaliwa(double srednieZuzyciePaliwa) {
        this.srednieZuzyciePaliwa = srednieZuzyciePaliwa;
    }

    public Pojazd(long id, double iloscKM, int iloscMiejsc, String marka, String miejsceParkingowe, String model, String numerPojazdu, double srednieZuzyciePaliwa) {
        this.id = id;
        this.iloscKM = iloscKM;
        this.iloscMiejsc = iloscMiejsc;
        this.marka = marka;
        this.miejsceParkingowe = miejsceParkingowe;
        this.model = model;
        this.numerPojazdu = numerPojazdu;
        this.srednieZuzyciePaliwa = srednieZuzyciePaliwa;
    }

    public Pojazd() {
    }

    @Override
    public String toString() {
        return "Pojazd{" +
                "id=" + id +
                ", iloscKM=" + iloscKM +
                ", iloscMiejsc=" + iloscMiejsc +
                ", marka='" + marka + '\'' +
                ", miejsceParkingowe='" + miejsceParkingowe + '\'' +
                ", model='" + model + '\'' +
                ", numerPojazdu='" + numerPojazdu + '\'' +
                ", srednieZuzyciePaliwa=" + srednieZuzyciePaliwa +
                '}';
    }
}
