package entities;

import javax.persistence.*;

/**
 * Created by Thomas on 17-6-2015.
 */
@Entity
public class BetalingsGegevens {
    @Id
    @Column(name = "accountID")
    private int accountID;
    @Column(name = "eigenaarnaam")
    private String eigenaarNaam;
    @Column(name = "nummer")
    private String nummer;
    @ManyToOne
    @JoinColumn(name = "gebruikersId")
    private Gebruiker gebruiker;

    public BetalingsGegevens(int accountID, String eigenaarNaam, String nummer, Gebruiker gebruiker) {
        super();
        this.accountID = accountID;
        this.eigenaarNaam = eigenaarNaam;
        this.nummer = nummer;
        this.gebruiker = gebruiker;
    }

    public Gebruiker getGebruiker() {
        return gebruiker;
    }

    public void setGebruiker(Gebruiker gebruiker) {
        this.gebruiker = gebruiker;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getEigenaarNaam() {
        return eigenaarNaam;
    }

    public void setEigenaarNaam(String eigenaarNaam) {
        this.eigenaarNaam = eigenaarNaam;
    }

    public String getNummer() {
        return nummer;
    }

    public void setNummer(String nummer) {
        this.nummer = nummer;
    }
}
