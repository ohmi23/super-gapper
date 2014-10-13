package supergapper.gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import supergapper.logiikka.liikkuja.Gapper;
import supergapper.logiikka.liikkuja.Suunta;

public class Nappaimistonkuuntelija implements KeyListener {

    Gapper gapper;

    public Nappaimistonkuuntelija(Gapper gapper) {
        this.gapper = gapper;
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_UP) {
            gapper.setUusiSuunta(Suunta.YLOS);
            gapper.liiku();
        }
        if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
            gapper.setUusiSuunta(Suunta.ALAS);
            gapper.liiku();
        }
        if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
            gapper.setUusiSuunta(Suunta.OIKEA);
            gapper.liiku();
        }
        if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
            gapper.setUusiSuunta(Suunta.VASEN);
            gapper.liiku();
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }

}
