package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Thomas on 17-6-2015.
 */
@Entity
public class CreditCard extends BetalingsGegevens{

    @Column(name = "banknaam")
    private String bankNaam;


    public CreditCard(int accountID, String eigenaarNaam, String nummer, Gebruiker gebruiker, String bankNaam) {
        super(accountID, eigenaarNaam, nummer, gebruiker);
        this.bankNaam = bankNaam;
    }

    public String getBankNaam() {
        return bankNaam;
    }

    public void setBankNaam(String bankNaam) {
        this.bankNaam = bankNaam;
    }
}
