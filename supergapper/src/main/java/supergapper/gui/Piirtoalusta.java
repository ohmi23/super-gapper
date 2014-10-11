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
        piirraGapper(g);
        piirraSeeker(g);
        piirraKentanReunat(g);
        piirraPisteet(g);
    }

    public void piirraGapper (Graphics g) {
        g.setColor(Color.MAGENTA);
        Gapper gapperi = peli.getGapper();
        g.fillOval(gapperi.getX(), gapperi.getY(), 10, 10);
    }
    
    public void piirraSeeker (Graphics g) {
        g.setColor(Color.CYAN);
        Seeker sipsiorkki = peli.getSeeker();
        g.fillRect(sipsiorkki.getX(), sipsiorkki.getY(), 10, 10);
    }
    
    
    public void piirraKentanReunat(Graphics g) {
        g.setColor(Color.RED);
        
        g.drawLine(15, 15, 15, 515); // vasen sivu
        g.drawLine(15, 15, 765, 15); // yläkansi
        g.drawLine(15, 515, 765, 515); // alakansi
        g.drawLine(765, 15, 765, 515); // oikea sivu
    
    }
    
    public void piirraKentanViivat_Level1(Graphics g) {
        g.setColor(Color.RED);
        
        g.drawLine(15, 15, 15, 515); // vasen sivu
        g.drawLine(15, 15, 765, 15); // yläkansi
        g.drawLine(15, 515, 765, 515); // alakansi
        g.drawLine(765, 15, 765, 515); // oikea sivu
    
    }
    
    
    
    public void piirraPisteet(Graphics g) {
        //pistetaulun päivitys
    }
    
    
    
}
