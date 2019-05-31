package proj1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Nagrody {
@Id
@GeneratedValue
private long id;
private String iloscPkt;
private  String iloscSztuk;
private String nazwa;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIloscPkt() {
        return iloscPkt;
    }

    public void setIloscPkt(String iloscPkt) {
        this.iloscPkt = iloscPkt;
    }

    public String getIloscSztuk() {
        return iloscSztuk;
    }

    public void setIloscSztuk(String iloscSztuk) {
        this.iloscSztuk = iloscSztuk;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Nagrody(String iloscPkt, String iloscSztuk, String nazwa) {
        this.iloscPkt = iloscPkt;
        this.iloscSztuk = iloscSztuk;
        this.nazwa = nazwa;
        }

    public Nagrody() {
    }

    @Override
    public String toString() {
        return "Nagrody{" +
                "id=" + id +
                ", iloscPkt=" + iloscPkt +
                ", iloscSztuk=" + iloscSztuk +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }
}
