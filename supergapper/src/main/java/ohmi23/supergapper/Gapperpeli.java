
package ohmi23.supergapper;

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
        this.gapper = new Gapper(0,0);
        this.seeker = new Seeker(3,3); // Tai Superseeker jossa AI.
        
        
    }
    
    // To do: 
    
    // JUnit testit testaavat onko kenttä oikean kokoinen.
    // Näppäimistönkuuntelija 
    // käyttöliittymä
    // Statistiikka (Elämät, pisteet, kentän numero)
    // Gapper-Seeker törmäysten tarkistaja joka havaitsee törmäyksen ja vähentää elämän, kun elämät loppuvat,
    // Matopeli kirjaa pisteet tiedostoon.
    // Matopeli päättyy.
    
}
