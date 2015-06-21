package entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Thomas on 17-6-2015.
 */
@Entity
public class AdvertentieReactie {

    @Id
    @GeneratedValue
    @Column(name = "advertentiereactieID")
    private int advertentieReactieId;
    @Column(name = "advertentiereactietekst")
    private String advertentieReactieTekst;
    @Column(name = "datum")
    private Date datum;
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "advertentieId")
    private Advertentie advertentie;
    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "gebruikersID")
    private Gebruiker gebruiker;

    public AdvertentieReactie(String advertentieReactieTekst, Date datum, Advertentie advertentie, Gebruiker gebruiker) {
        this.advertentieReactieTekst = advertentieReactieTekst;
        this.datum = datum;
        this.advertentie = advertentie;
        this.gebruiker = gebruiker;
    }

    public int getAdvertentieReactieId() {
        return advertentieReactieId;
    }

    public void setAdvertentieReactieId(int advertentieReactieId) {
        this.advertentieReactieId = advertentieReactieId;
    }

    public String getAdvertentieReactieTekst() {
        return advertentieReactieTekst;
    }

    public void setAdvertentieReactieTekst(String advertentieReactieTekst) {
        this.advertentieReactieTekst = advertentieReactieTekst;
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

    public Gebruiker getGebruiker() {
        return gebruiker;
    }

    public void setGebruiker(Gebruiker gebruiker) {
        this.gebruiker = gebruiker;
    }
}
