
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

    private int pisteet;
    private int elamat;
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
        this.kentanNumero = kentanNumero;
        this.elamat = 3;
        this.pisteet = 0;
        addActionListener(this);
        setInitialDelay(1000);
        
        this.kentta = new Kentta(kentanLeveys, kentanKorkeus);
        this.kentta.luoKentta(this.kentanNumero);
        this.gapper = new Gapper(10,10, Suunta.OIKEA);
        this.seeker = new Seeker(760,510, Suunta.VASEN);
        
   }
    
    // To do: 
    // JUnit testit testaavat onko kenttä oikean kokoinen yms.
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
    
    public int getKentanNumero() {
        return this.kentanNumero;
    }
    
    public int getElamat() {
        return this.elamat;
    }
    
    public int getPisteet() {
        return this.pisteet;
    }
    
    public void aloitaKenttaAlusta() {
        this.gapper.setSuunta(Suunta.OIKEA);
        this.gapper.setUusiSuunta(Suunta.OIKEA);
        this.gapper.setSijainti(10, 10);
        this.seeker.setSijainti(760,510);
    
    }
            
    public void setPaivitettava(Paivitettava paivitettava) {
        this.paivitettava = paivitettava;
    }
    
    public boolean jatkuu() {
        return jatkuu;
    }
    
    public void tarkastaTormaykset(Gapper gapper, Seeker seeker) {
        if (gapper.getX() == seeker.getX() && gapper.getY() == seeker.getY()) {
            this.elamat--;
            if (this.elamat > 0) {
                aloitaKenttaAlusta();
            } else {
                this.jatkuu = false;
            }
            
        } else {
            this.jatkuu = true;
        }
    }
    
    
    /*
    Gapper liikkuu kahdesti
    Seeker liikkuu kerran
    Jos Gapper osuu seinään, se jää paikalleen.
    Jos gapper osuu Seekeriin vähennetään elämä ja aloitetaan kentta alusta.
    Jos elämät menevät nollaan, peli päättyy.
    to do: Tarkistetaan onko kaikkialla käyty, jos on niin uusi kenttä.
    to do: nopeuden säätö
    */
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!jatkuu) {
            return;
        }
        gapper.liiku();
        tarkastaTormaykset(this.gapper, this.seeker);
        seeker.jahtaa(gapper);
        gapper.liiku();
        tarkastaTormaykset(this.gapper, this.seeker);
        pisteet++;
        
        paivitettava.paivita();
        setDelay(8); // nopeutetaan kentän mukaan
        
    }
}
