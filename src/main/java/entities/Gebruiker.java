package entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Thomas on 17-6-2015.
 */
@Entity
public class Gebruiker {
    @Id
    @GeneratedValue
    @Column(name = "gebruikersID")
    private int gebruikersId;
    @Column(name = "voornaam")
    private String voornaam;
    @Column(name = "achternaam")
    private String achternaam;
    @Column(name = "email")
    private String email;
    @Column(name = "wachtwoord")
    private String wachtwoord;
    @OneToMany(mappedBy = "accountID")
    private List<BetalingsGegevens> betalingsGegevens;
    @OneToMany(mappedBy = "koper")
    private List<Advertentie> advertenties;
    @OneToMany(mappedBy = "advertentieReactieId")
    private List<AdvertentieReactie> advertentieReacties;


    public Gebruiker(String voornaam, String achternaam, String email, String wachtwoord, List<BetalingsGegevens> betalingsGegevens, List<Advertentie> advertenties, List<AdvertentieReactie> advertentieReacties) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.email = email;
        this.wachtwoord = wachtwoord;
        this.betalingsGegevens = betalingsGegevens;
        this.advertenties = advertenties;
        this.advertentieReacties = advertentieReacties;
    }

    public List<Advertentie> getAdvertenties() {
        return advertenties;
    }

    public void setAdvertenties(List<Advertentie> advertenties) {
        this.advertenties = advertenties;
    }

    public List<AdvertentieReactie> getAdvertentieReacties() {
        return advertentieReacties;
    }

    public void setAdvertentieReacties(List<AdvertentieReactie> advertentieReacties) {
        this.advertentieReacties = advertentieReacties;
    }

    public int getGebruikersId() {
        return gebruikersId;
    }

    public void setGebruikersId(int gebruikersId) {
        this.gebruikersId = gebruikersId;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }

    public List<BetalingsGegevens> getBetalingsGegevens() {
        return betalingsGegevens;
    }

    public void setBetalingsGegevens(List<BetalingsGegevens> betalingsGegevens) {
        this.betalingsGegevens = betalingsGegevens;
    }
}
