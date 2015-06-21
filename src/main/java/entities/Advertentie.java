package entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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
    @OneToMany(mappedBy = "advertentie")
    private List<Bod> biedingen;
    @ManyToOne
    @JoinColumn(name = "verkoper", referencedColumnName = "gebruikersId")
    private Gebruiker verkoper;
    @ManyToMany
    @JoinTable(name = "cat_ad",
    joinColumns = {@JoinColumn(name = "advertentieID", referencedColumnName = "advertentieID")},
    inverseJoinColumns = {@JoinColumn(name = "categoryID", referencedColumnName = "categoryID")})
    private List<Category> categories;
    @OneToMany(mappedBy = "advertentie")
    private List<AdvertentieReactie> reacties;
    @ManyToOne
    @JoinColumn(name = "koper", referencedColumnName = "gebruikersId")
    private Gebruiker koper;


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

    public List<Bod> getBiedingen() {
        return biedingen;
    }

    public void setBiedingen(List<Bod> biedingen) {
        this.biedingen = biedingen;
    }

    public Gebruiker getVerkoper() {
        return verkoper;
    }

    public void setVerkoper(Gebruiker verkoper) {
        this.verkoper = verkoper;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<AdvertentieReactie> getReacties() {
        return reacties;
    }

    public void setReacties(List<AdvertentieReactie> reacties) {
        this.reacties = reacties;
    }

    public Gebruiker getKoper() {
        return koper;
    }

    public void setKoper(Gebruiker koper) {
        this.koper = koper;
    }

    public Advertentie(String advertentieNaam, String advertentieBeschrijving, Integer startPrijs, boolean advertentieActief, Date startDatum, List<Bod> biedingen, Gebruiker verkoper, List<Category> categories, List<AdvertentieReactie> reacties, Gebruiker koper) {

        this.advertentieNaam = advertentieNaam;
        this.advertentieBeschrijving = advertentieBeschrijving;
        this.startPrijs = startPrijs;
        this.advertentieActief = advertentieActief;
        this.startDatum = startDatum;
        this.biedingen = biedingen;
        this.verkoper = verkoper;
        this.categories = categories;
        this.reacties = reacties;
        this.koper = koper;
    }
}
