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
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "banknaam")
    private String bankNaam;

    public CreditCard(String eigenaarNaam, String nummer, String bankNaam) {
        super(eigenaarNaam, nummer);
        this.bankNaam = bankNaam;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBankNaam() {
        return bankNaam;
    }

    public void setBankNaam(String bankNaam) {
        this.bankNaam = bankNaam;
    }
}
