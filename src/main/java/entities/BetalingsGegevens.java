package entities;

/**
 * Created by Thomas on 17-6-2015.
 */
public class BetalingsGegevens {

    private String eigenaarNaam;
    private String nummer;

    public BetalingsGegevens(String eigenaarNaam, String nummer) {
        super();
        this.eigenaarNaam = eigenaarNaam;
        this.nummer = nummer;
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
