package entities;

import java.util.Date;

/**
 * Created by Thomas on 17-6-2015.
 */
public class Advertentie {

    private String advertentieNaam;
    private String advertentieBeschrijving;
    private Integer startPrijs;
    private boolean advertentieActief;
    private Date startDatum;
    private Bod bod;
    private Gebruiker gebruiker;

    public Advertentie(String advertentieNaam, String advertentieBeschrijving, Integer startPrijs, boolean advertentieActief, Date startDatum, Bod bod, Gebruiker gebruiker) {
        this.advertentieNaam = advertentieNaam;
        this.advertentieBeschrijving = advertentieBeschrijving;
        this.startPrijs = startPrijs;
        this.advertentieActief = advertentieActief;
        this.startDatum = startDatum;
        this.bod = bod;
        this.gebruiker = gebruiker;
    }

    public Bod getBod() {
        return bod;
    }

    public void setBod(Bod bod) {
        this.bod = bod;
    }

    public Gebruiker getGebruiker() {
        return gebruiker;
    }

    public void setGebruiker(Gebruiker gebruiker) {
        this.gebruiker = gebruiker;
    }

    public String getAdvertentieNaam() {
        return advertentieNaam;
    }

    public void setAdvertentieNaam(String advertentieNaam) {
        this.advertentieNaam = advertentieNaam;
    }

    public String getAdvertentieBeschrijving() {
        return advertentieBeschrijving;
    }

    public void setAdvertentieBeschrijving(String advertentieBeschrijving) {
        this.advertentieBeschrijving = advertentieBeschrijving;
    }

    public Integer getStartPrijs() {
        return startPrijs;
    }

    public void setStartPrijs(Integer startPrijs) {
        this.startPrijs = startPrijs;
    }

    public boolean isAdvertentieActief() {
        return advertentieActief;
    }

    public void setAdvertentieActief(boolean advertentieActief) {
        this.advertentieActief = advertentieActief;
    }

    public Date getStartDatum() {
        return startDatum;
    }

    public void setStartDatum(Date startDatum) {
        this.startDatum = startDatum;
    }
}
