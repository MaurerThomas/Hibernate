package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Thomas on 17-6-2015.
 */
@Entity
public class Gebruiker {
    @Id
    @GeneratedValue
    @Column(name="gebruikersID")
    private int gebruikersId;
    @Column(name = "voornaam")
    private String voornaam;
    @Column(name = "achternaam")
    private String achternaam;
    @Column(name = "email")
    private String email;
    @Column(name = "wachtwoord")
    private String wachtwoord;
   /*
    @Column(name = "betalingsgegevens")
    private BetalingsGegevens betalingsGegevens;
    */
    public Gebruiker(String voornaam, String achternaam, String email, String wachtwoord, BetalingsGegevens betalingsGegevens) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.email = email;
        this.wachtwoord = wachtwoord;
        /*
        this.betalingsGegevens = betalingsGegevens;
        */
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

    /*
    public BetalingsGegevens getBetalingsGegevens() {
        return betalingsGegevens;
    }

    public void setBetalingsGegevens(BetalingsGegevens betalingsGegevens) {
        this.betalingsGegevens = betalingsGegevens;
    }
    */
}
