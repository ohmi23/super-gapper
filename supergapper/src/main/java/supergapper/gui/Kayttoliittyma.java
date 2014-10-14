package supergapper.gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import supergapper.Gapperpeli;

/**
 * Kayttoliittyma-luokka 
 * Kayttoliittyma 
 * @param gapperpeli gapperpeli
 * @param sivunpituus
 * @param sivunleveys 
 */


public class Kayttoliittyma implements Runnable {

    private JFrame frame;
    private Gapperpeli gapperpeli;
    private int sivunPituus;
    private int sivunLeveys;
    private Piirtoalusta piirtoalusta;

    public Kayttoliittyma(Gapperpeli gapperpeli, int sivunpituus, int sivunleveys) {
        this.gapperpeli = gapperpeli;
        this.sivunPituus = sivunpituus;
        this.sivunLeveys = sivunleveys;
    }

    @Override
    public void run() {
        frame = new JFrame("Supergapper 2014 (v0.1)" + " (" + this.sivunPituus + "x" + this.sivunLeveys + ")");
        int sivunPituus = this.sivunPituus;
        int sivunLeveys = this.sivunLeveys;
        frame.setPreferredSize(new Dimension(sivunPituus, sivunLeveys));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);

    }

    public void luoKomponentit(Container container) {
        piirtoalusta = new Piirtoalusta(gapperpeli, 600, 800);
        container.add(piirtoalusta);
        Nappaimistonkuuntelija n = new Nappaimistonkuuntelija(gapperpeli.getGapper());
        getFrame().addKeyListener(n);

    }
    
    public Paivitettava getPaivitettava() {
        return piirtoalusta;
    }
    
     public JFrame getFrame() {
        return frame;
    }

}
