package supergapper.logiikka.pisteet;

/*
 luokan kuvaus - javadoc

 Pistelaskuri-luokan tiedot näytetään käyttöliittymän alareunassa.
 Luokka muistaa Kentän numeron, pisteet ja elämät.

*/

public class Pistelaskuri {

    // tuntee kentän ja kentän ruudut.
    int kentanNumero;
    int pisteet;
    int elamat;

    public Pistelaskuri() {
        this.kentanNumero = 1;
        this.pisteet = 0;
        this.elamat = 3;
    }
    
    public void lisaaNormaalitPisteet() {
        this.pisteet += 50;
    }

    public void lisaaErikoisPisteet() {
        this.pisteet += 100;
    }
    
    public void nollaaPisteet() {
        this.pisteet = 0;
    }

    public void setKentanNumero(int kentanNumero) {
        this.kentanNumero = kentanNumero;
    }
    
    public void seuraavaKentta() {
        this.kentanNumero += 1;
    }
    
    public void alkuKentta() {
        this.kentanNumero = 1;
    }
    
    public void vahennaElama() {
        if (this.elamat > 0) {
            this.elamat -= 1;
        }
    }

    public void lisaElama() {
        this.elamat += 1;
    }
    
    
    
}
