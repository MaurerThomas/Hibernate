package entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Thomas on 17-6-2015.
 */
@Entity
public class Advertentie {
    @Id
    @GeneratedValue
    @Column(name = "advertentieID")
    private int advertentieId;
    @Column(name = "advertentienaam")
    private String advertentieNaam;
    @Column(name = "advertentiebeschrijving")
    private String advertentieBeschrijving;
    @Column(name = "startprijs")
    private Integer startPrijs;
    @Column(name = "advertentieactief")
    private boolean advertentieActief;
    @Column(name = "startdatum")
    private Date startDatum;
    @ManyToOne
    @JoinColumn(name = "bodID")
    private Bod bod;
    @Column(name = "gebruiker")
    private Gebruiker gebruiker;
    @ManyToOne
    @JoinColumn(name = "categoryID")
    private Category category;

    public Advertentie(int advertentieId, String advertentieNaam, String advertentieBeschrijving, Integer startPrijs, boolean advertentieActief, Date startDatum, Bod bod, Gebruiker gebruiker, Category category) {
        this.advertentieId = advertentieId;
        this.advertentieNaam = advertentieNaam;
        this.advertentieBeschrijving = advertentieBeschrijving;
        this.startPrijs = startPrijs;
        this.advertentieActief = advertentieActief;
        this.startDatum = startDatum;
        this.bod = bod;
        this.gebruiker = gebruiker;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getAdvertentieId() {
        return advertentieId;
    }

    public void setAdvertentieId(int advertentieId) {
        this.advertentieId = advertentieId;
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
