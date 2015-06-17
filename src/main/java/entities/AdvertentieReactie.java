package entities;

import java.util.Date;

/**
 * Created by Thomas on 17-6-2015.
 */
public class AdvertentieReactie {

    private String advertentieReactieTekst;
    private Date datum;
    private Advertentie advertentie;
    private Gebruiker gebruiker;

    public AdvertentieReactie(String advertentieReactieTekst, Date datum, Advertentie advertentie, Gebruiker gebruiker) {
        this.advertentieReactieTekst = advertentieReactieTekst;
        this.datum = datum;
        this.advertentie = advertentie;
        this.gebruiker = gebruiker;
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
