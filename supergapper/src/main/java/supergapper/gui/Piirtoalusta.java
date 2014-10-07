package supergapper.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import supergapper.Gapperpeli;
import supergapper.logiikka.liikkuja.Gapper;
import supergapper.logiikka.liikkuja.Seeker;

public class Piirtoalusta extends JPanel implements Paivitettava {

    private Gapperpeli peli;
    private int sivunPituus;
    private int sivunLeveys;
    
    public Piirtoalusta(Gapperpeli peli, int sivunPituus, int sivunLeveys) {
        super.setBackground(Color.BLACK);
        this.peli = peli;
        this.sivunPituus = sivunPituus;
        this.sivunLeveys = sivunLeveys;
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
        g.fillOval(gapperi.getX(), gapperi.getY(), 10, 10);

        Seeker sipsiorkki = peli.getSeeker();
        g.setColor(Color.CYAN);
        g.fillRect(sipsiorkki.getX(), sipsiorkki.getY(), 10, 10);
        
        g.setColor(Color.RED);
        g.drawLine(15, 15, 15, 505);
        g.drawLine(15, 15, 505, 15);
        g.drawLine(15, 505, 505, 505);
        g.drawLine(505, 15, 505, 505);
        
    }
    
    
    
}
