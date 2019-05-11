package proj1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Nagrody {
@Id
@GeneratedValue
private int id;
private int iloscPkt;
private  int iloscSztuk;
private String nazwa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIloscPkt() {
        return iloscPkt;
    }

    public void setIloscPkt(int iloscPkt) {
        this.iloscPkt = iloscPkt;
    }

    public int getIloscSztuk() {
        return iloscSztuk;
    }

    public void setIloscSztuk(int iloscSztuk) {
        this.iloscSztuk = iloscSztuk;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Nagrody(int iloscPkt, int iloscSztuk, String nazwa) {
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
