
package supergapper;

import supergapper.logiikka.liikkuja.Gapper;
import supergapper.logiikka.liikkuja.Seeker;
import supergapper.logiikka.kentta.Kentta;
import supergapper.logiikka.liikkuja.Suunta;

public class Gapperpeli {

    private int korkeus;
    private int leveys;
    private boolean jatkuu;
    private Kentta kentta;
    private Gapper gapper;
    private Seeker seeker;
    
    public Gapperpeli(int leveys, int korkeus) {
        
        this.leveys = leveys;
        this.korkeus = korkeus;
        this.jatkuu = true;
        this.kentta = new Kentta(leveys, korkeus);
        this.gapper = new Gapper(0,0, Suunta.OIKEA);
        this.seeker = new Seeker(3,3, Suunta.VASEN); // Tai Superseeker jossa AI.
    }
    
    
    
    
    
    // To do: 
    
    // JUnit testit testaavat onko kenttä oikean kokoinen yms.
    // Näppäimistönkuuntelija 
    // käyttöliittymä
    // Gapper-Seeker törmäysten tarkistaja joka havaitsee törmäyksen ja vähentää elämän, kun elämät loppuvat,
    // Gapperpeli kirjaa pisteet tiedostoon.
    // Gapperpeli päättyy.

    public Gapper getGapper() {
        return gapper;
    }
    
}
