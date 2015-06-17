package entities;

import java.util.Date;

/**
 * Created by Thomas on 17-6-2015.
 */
public class Bod {

    private Integer prijs;
    private Date datum;
    private Advertentie advertentie;
    private Gebruiker bodVanGebruiker;

    public Bod(Integer prijs, Date datum, Advertentie advertentie, Gebruiker bodVanGebruiker) {
        this.prijs = prijs;
        this.datum = datum;
        this.advertentie = advertentie;
        this.bodVanGebruiker = bodVanGebruiker;
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
