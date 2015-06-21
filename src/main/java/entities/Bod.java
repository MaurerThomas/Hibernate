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
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "advertentieId")
    private Advertentie advertentie;
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "gebruikersId")
    private Gebruiker bieder;

    public Bod(Integer prijs, Date datum, Advertentie advertentie, Gebruiker bieder) {
        this.prijs = prijs;
        this.datum = datum;
        this.advertentie = advertentie;
        this.bieder = bieder;
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

    public Gebruiker getBieder() {
        return bieder;
    }

    public void setBieder(Gebruiker bieder) {
        this.bieder = bieder;
    }
}
