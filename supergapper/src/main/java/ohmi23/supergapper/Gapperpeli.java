
package ohmi23.supergapper;

public class Gapperpeli {

    private int korkeus;
    private int leveys;
    private boolean jatkuu;
    //private Gapper gapper;
    //private Seeker seeker;
    //private Kentta kentta;
    
    
    public Gapperpeli(int leveys, int korkeus) {
        
        this.leveys = leveys;
        this.korkeus = korkeus;
        this.jatkuu = true;
        
        
    }
    
    
    // To do: 
    
    // JUnit testit testaavat onko kenttä oikean kokoinen.
    
    // Matopeli luo kentän käyttäen Tronviiva-olioita.
    // Tronviiva-olion sisälle tulee lista kohdista joissa on käyty.
    
    // Näppäimistönkuuntelija ja käyttöliittymä-luokat.
    
    // Matopeli luo Gapper-olion. (extends Ukko)
    // Matopeli luo Seeker-olion. (extends Ukko)
    // Matopeli luo SuperSeeker olion jolla parempi tekoäly (Extends Seeker)
    // Matopeli alkaa laskemaan kentän numeroa, pisteitä ja elämiä.
    // Matopeli tarkkailee Gapper-Seeker törmäyksiä.
    
    // 
    
    // Matopeli käynnistää pelin
    // Matopeli havaitsee törmäyksen ja vähentää elämän, kun elämät loppuvat,
    // Matopeli kirjaa pisteet.
    // Matopeli päättyy.
    
}
