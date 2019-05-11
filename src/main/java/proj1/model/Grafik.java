package proj1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
public class Grafik {
    @Id
    @GeneratedValue
    private int id;
    private Date dataRozpoczecia;
    private Date dataZakonczenia;
    private String harmonogram;
    @OneToOne
    private Pracownicy pracownik;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataRozpoczecia() {
        return dataRozpoczecia;
    }

    public void setDataRozpoczecia(Date dataRozpoczecia) {
        this.dataRozpoczecia = dataRozpoczecia;
    }

    public Date getDataZakonczenia() {
        return dataZakonczenia;
    }

    public void setDataZakonczenia(Date dataZakonczenia) {
        this.dataZakonczenia = dataZakonczenia;
    }

    public String getHarmonogram() {
        return harmonogram;
    }

    public void setHarmonogram(String harmonogram) {
        this.harmonogram = harmonogram;
    }


    public Pracownicy getPracownik() {
        return pracownik;
    }

    public void setPracownik(Pracownicy pracownik) {
        this.pracownik = pracownik;
    }

    public Grafik() {
    }

    public Grafik(Date dataRozpoczecia, Date dataZakonczenia, String harmonogram, Pracownicy pracownik) {
        this.dataRozpoczecia = dataRozpoczecia;
        this.dataZakonczenia = dataZakonczenia;
        this.harmonogram = harmonogram;
        this.pracownik = pracownik;
    }

    @Override
    public String toString() {
        return "GrafikRepository{" +
                "id=" + id +
                ", dataRozpoczecia=" + dataRozpoczecia +
                ", dataZakonczenia=" + dataZakonczenia +
                ", harmonogram='" + harmonogram + '\'' +
                ", pracownik=" + pracownik +
                '}';
    }
}
