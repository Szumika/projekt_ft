package proj1.model;

import proj1.model.security.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
public class Rezerwacje {
@Id
@GeneratedValue
private int id;
private double cena;
@OneToOne
private Przystanek przystanekStart;
@OneToOne
private Data date;

    @OneToOne
private User user;

    public Data getDate() {
        return date;
    }

    public Rezerwacje(double cena, Przystanek przystanekStart, Data date, User user) {
        this.cena = cena;
        this.przystanekStart = przystanekStart;
        this.date = date;
        this.user = user;
    }

    public void setDate(Data date) {
        this.date = date;
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

    public Przystanek getPrzystanekStart() {
        return przystanekStart;
    }

    public void setPrzystanekStart(Przystanek przystanekStart) {
        this.przystanekStart = przystanekStart;
    }

//    public Przystanek getPrzystanekKoncowy() {
//        return przystanekKoncowy;
//    }
//
//    public void setPrzystanekKoncowy(Przystanek przystanekKoncowy) {
//        this.przystanekKoncowy = przystanekKoncowy;
//    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }



    public Rezerwacje() {
    }


    @Override
    public String toString() {
        return "Rezerwacje{" +
                "id=" + id +
                ", cena=" + cena +
                ", przystanekStart=" + przystanekStart +
                ", date=" + date +
                ", user=" + user +
                '}';
    }
}
