package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Thomas on 17-6-2015.
 */
@Entity
public class IDeal extends BetalingsGegevens {

    @Column(name = "vervalmaand")
    private Integer vervalMaand;
    @Column(name = "vervaljaar")
    private Integer vervalJaar;

    public IDeal(int accountID, String eigenaarNaam, String nummer, Gebruiker gebruiker, Integer vervalMaand, Integer vervalJaar) {
        super(accountID, eigenaarNaam, nummer, gebruiker);
        this.vervalMaand = vervalMaand;
        this.vervalJaar = vervalJaar;
    }

    public Integer getVervalMaand() {
        return vervalMaand;
    }

    public void setVervalMaand(Integer vervalMaand) {
        this.vervalMaand = vervalMaand;
    }

    public Integer getVervalJaar() {
        return vervalJaar;
    }

    public void setVervalJaar(Integer vervalJaar) {
        this.vervalJaar = vervalJaar;
    }
}
