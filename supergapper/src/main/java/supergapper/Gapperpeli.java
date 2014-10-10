
package supergapper;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import supergapper.gui.Paivitettava;
import supergapper.logiikka.liikkuja.Gapper;
import supergapper.logiikka.liikkuja.Seeker;
import supergapper.logiikka.kentta.Kentta;
import supergapper.logiikka.liikkuja.Suunta;

public class Gapperpeli extends Timer implements ActionListener { 

    private int kentanNumero;
    private int kentanLeveys;
    private int kentanKorkeus;
    private boolean jatkuu;
    private Kentta kentta;
    private Gapper gapper;
    private Seeker seeker;
    private Paivitettava paivitettava;
    
    public Gapperpeli(int kentanNumero) {
        super(1000, null); // Timer
        this.jatkuu = true;
        this.kentanNumero = this.kentanNumero;
        
        addActionListener(this);
        setInitialDelay(1000);
        
        this.kentta = new Kentta(kentanLeveys, kentanKorkeus);
        this.kentta.luoKentta(this.kentanNumero);
        this.gapper = new Gapper(10,10, Suunta.OIKEA);
        //this.seeker = new Seeker(760,500, Suunta.VASEN); // Tai Superseeker jossa AI.
        this.seeker = new Seeker(60,60, Suunta.VASEN);
        
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
    
    public Seeker getSeeker() {
        return seeker;
    }
    
    public void setGapper(Gapper gapper) {
        this.gapper = gapper;
    }
    
    public void setSeeker(Seeker seeker) {
        this.seeker = seeker;
    }
    
    public void setKentta(Kentta kentta) {
        this.kentta = kentta;
    }
            
    public void setPaivitettava(Paivitettava paivitettava) {
        this.paivitettava = paivitettava;
    }
    
    public boolean jatkuu() {
        return jatkuu;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!jatkuu) {
            return;
        }
        gapper.liiku();
        seeker.jahtaa(gapper);
        //seeker.pakene(gapper);
        
        
        // Jos Gapper osuu seinään, se jää paikalleen.
        // Jos gapper osuu Seekeriin jatkuu = false.
        // Tarkistetaan onko kaikkialla käyty, jos on niin uusi kenttä.
               
        
        paivitettava.paivita();
        setDelay(10); // nopeutetaan kentän mukaan
        
        
        
        
    }
}
