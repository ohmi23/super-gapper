package supergapper.logiikka.kentta;

/**
 * Ruutu-luokka
 * 
 */

public class Ruutu {

    private int pisteluku;

    public Ruutu() {
        this.pisteluku = 0;
    }

    public void nollaaPisteet() {
        this.pisteluku = 0;
    }

    public void setPisteluku50() {
        this.pisteluku = 50;
    }

    public void setPisteluku100() {
        this.pisteluku = 100;
    }

    public int getPisteluku() {
        return pisteluku;
    }
}
