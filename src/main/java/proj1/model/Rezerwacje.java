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
private Date data;
@OneToOne
private Przystanek przystanekStart;
@OneToOne
private Przystanek przystanekKoncowy;
@OneToOne
private User user;

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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Przystanek getPrzystanekStart() {
        return przystanekStart;
    }

    public void setPrzystanekStart(Przystanek przystanekStart) {
        this.przystanekStart = przystanekStart;
    }

    public Przystanek getPrzystanekKoncowy() {
        return przystanekKoncowy;
    }

    public void setPrzystanekKoncowy(Przystanek przystanekKoncowy) {
        this.przystanekKoncowy = przystanekKoncowy;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public Rezerwacje(double cena, Date data, Przystanek przystanekStart, Przystanek przystanekKoncowy, User user) {
        this.cena = cena;
        this.data = data;
        this.przystanekStart = przystanekStart;
        this.przystanekKoncowy = przystanekKoncowy;
        this.user = user;
    }

    public Rezerwacje() {
    }

    @Override
    public String toString() {
        return "Rezerwacje{" +
                "id=" + id +
                ", cena=" + cena +
                ", data=" + data +
                ", przystanekStart=" + przystanekStart +
                ", przystanekKoncowy=" + przystanekKoncowy +
                ", user=" + user +
                '}';
    }
}
