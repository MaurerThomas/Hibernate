package entities;

/**
 * Created by Thomas on 17-6-2015.
 */
public class CreditCard extends BetalingsGegevens{

    private String bankNaam;

    public CreditCard(String eigenaarNaam, String nummer, String bankNaam) {
        super(eigenaarNaam, nummer);
        this.bankNaam = bankNaam;
    }

    public String getBankNaam() {
        return bankNaam;
    }

    public void setBankNaam(String bankNaam) {
        this.bankNaam = bankNaam;
    }
}
