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
            gapper.setSuunta(Suunta.YLOS);
        }
        if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
            gapper.setSuunta(Suunta.ALAS);
        }
        if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
            gapper.setSuunta(Suunta.OIKEA);
        }
        if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
            gapper.setSuunta(Suunta.VASEN);
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }

}
