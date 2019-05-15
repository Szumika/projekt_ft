package proj1.model;

import proj1.model.security.User;

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
    private String dataRozpoczecia;
    private String dataZakonczenia;
    private String harmonogram;
    @OneToOne
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataRozpoczecia() {
        return dataRozpoczecia;
    }

    public void setDataRozpoczecia(String dataRozpoczecia) {
        this.dataRozpoczecia = dataRozpoczecia;
    }

    public String getDataZakonczenia() {
        return dataZakonczenia;
    }

    public void setDataZakonczenia(String dataZakonczenia) {
        this.dataZakonczenia = dataZakonczenia;
    }

    public String getHarmonogram() {
        return harmonogram;
    }

    public void setHarmonogram(String harmonogram) {
        this.harmonogram = harmonogram;
    }




    public Grafik() {
    }

    public Grafik(String dataRozpoczecia, String dataZakonczenia, String harmonogram, User user) {
        this.dataRozpoczecia = dataRozpoczecia;
        this.dataZakonczenia = dataZakonczenia;
        this.harmonogram = harmonogram;
        this.user = user;
    }

    @Override
    public String toString() {
        return "GrafikRepository{" +
                "id=" + id +
                ", dataRozpoczecia=" + dataRozpoczecia +
                ", dataZakonczenia=" + dataZakonczenia +
                ", harmonogram='" + harmonogram + '\'' +
                ", pracownik=" + user +
                '}';
    }
}
