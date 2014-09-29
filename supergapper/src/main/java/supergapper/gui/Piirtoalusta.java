package supergapper.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import supergapper.Gapperpeli;
import supergapper.logiikka.liikkuja.Gapper;

public class Piirtoalusta extends JPanel implements Paivitettava {

    private Gapperpeli peli;
    private int sivunPituus;
    
    public Piirtoalusta(Gapperpeli peli, int sivunPituus) {
        this.peli = peli;
        this.sivunPituus = sivunPituus;
    }
    
    @Override
    public void paivita() {
        repaint();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.MAGENTA);
        Gapper gapperi = peli.getGapper();
        g.fillOval(10 * gapperi.getX(), 10 * gapperi.getY(), 10, 10);
  
        
    }
    
    
    
}
