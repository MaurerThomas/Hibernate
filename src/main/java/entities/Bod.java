package entities;

import java.util.Date;
import javax.persistence.*;

/**
 * Created by Thomas on 17-6-2015.
 */
@Entity
public class Bod {
    @Id
    @GeneratedValue
    @Column(name = "bodID")
    private int bodId;
    @Column(name = "prijs")
    private Integer prijs;
    @Column(name = "datum")
    private Date datum;
    @Column(name = "advertentie")
    @OneToMany(mappedBy = "bod")
    private Advertentie advertentie;
    @Column(name = "bodvangebruiker")
    private Gebruiker bodVanGebruiker;

    public Bod(Integer prijs, Date datum, Advertentie advertentie, Gebruiker bodVanGebruiker) {
        this.prijs = prijs;
        this.datum = datum;
        this.advertentie = advertentie;
        this.bodVanGebruiker = bodVanGebruiker;
    }

    public int getBodId() {
        return bodId;
    }

    public void setBodId(int bodId) {
        this.bodId = bodId;
    }

    public Integer getPrijs() {
        return prijs;
    }

    public void setPrijs(Integer prijs) {
        this.prijs = prijs;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Advertentie getAdvertentie() {
        return advertentie;
    }

    public void setAdvertentie(Advertentie advertentie) {
        this.advertentie = advertentie;
    }

    public Gebruiker getBodVanGebruiker() {
        return bodVanGebruiker;
    }

    public void setBodVanGebruiker(Gebruiker bodVanGebruiker) {
        this.bodVanGebruiker = bodVanGebruiker;
    }
}
