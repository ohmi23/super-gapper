package supergapper.gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import supergapper.Gapperpeli;

public class Kayttoliittyma implements Runnable {

    private JFrame frame;
    private Gapperpeli gapperpeli;
    private int sivunpituus;
    private Piirtoalusta piirtoalusta;

    public Kayttoliittyma(Gapperpeli gapperpeli, int sivunpituus) {
        this.gapperpeli = gapperpeli;
        this.sivunpituus = sivunpituus;
    }

    @Override
    public void run() {
        frame = new JFrame("Supergapper 2014 (v0.1)");
        int sivunPituus = 600;
        int sivunKorkeus = 600;
        frame.setPreferredSize(new Dimension(sivunPituus, sivunKorkeus));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        luoKomponentit(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);

    }

    public void luoKomponentit(Container container) {
        piirtoalusta = new Piirtoalusta(gapperpeli, 600);
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
