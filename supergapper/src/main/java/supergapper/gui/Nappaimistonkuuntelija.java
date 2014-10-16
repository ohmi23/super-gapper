package supergapper.gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import supergapper.logiikka.liikkuja.Gapper;
import supergapper.logiikka.liikkuja.Suunta;

/**
 * Näppäimistönkuuntelija-luokka.
 * 
 */

public class Nappaimistonkuuntelija implements KeyListener {

    private Gapper gapper;

    public Nappaimistonkuuntelija(Gapper gapper) {
        this.gapper = gapper;
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }
    
    /*
    Nuolinäppäimet asettavat gapperille uuden suunnan.
    */
    

    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_UP) {
            gapper.setUusiSuunta(Suunta.YLOS);
        }
        if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
            gapper.setUusiSuunta(Suunta.ALAS);
        }
        if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
            gapper.setUusiSuunta(Suunta.OIKEA);
        }
        if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
            gapper.setUusiSuunta(Suunta.VASEN);
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }

}
