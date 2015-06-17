package entities;

/**
 * Created by Thomas on 17-6-2015.
 */
public class IDeal extends BetalingsGegevens {

    private Integer vervalMaand;
    private Integer vervalJaar;

    public IDeal(String eigenaarNaam, String nummer, Integer vervalMaand, Integer vervalJaar) {
        super(eigenaarNaam, nummer);
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
