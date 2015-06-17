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
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "vervalmaand")
    private Integer vervalMaand;
    @Column(name = "vervaljaar")
    private Integer vervalJaar;

    public IDeal(String eigenaarNaam, String nummer, Integer vervalMaand, Integer vervalJaar) {
        super(eigenaarNaam, nummer);
        this.vervalMaand = vervalMaand;
        this.vervalJaar = vervalJaar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
