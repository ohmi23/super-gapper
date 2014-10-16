package supergapper.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import supergapper.Gapperpeli;
import supergapper.logiikka.liikkuja.Gapper;
import supergapper.logiikka.liikkuja.Seeker;

/**
 * Piirtoalusta-luokka.
 */


public class Piirtoalusta extends JPanel implements Paivitettava {

    private Gapperpeli peli;
    private int sivunPituus;
    private int sivunLeveys;
    private int kentanNumero;

    public Piirtoalusta(Gapperpeli peli, int sivunPituus, int sivunLeveys) {
        super.setBackground(Color.BLACK);
        this.peli = peli;
        this.sivunPituus = sivunPituus;
        this.sivunLeveys = sivunLeveys;
        this.kentanNumero = peli.getKentanNumero();
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
        if (kentanNumero == 1) {
            piirraKentanSisaViivat_Level1(g);
        } else if (kentanNumero == 2) {
            piirraKentanSisaViivat_Level2(g);
        }
        
        piirraPisteet(g);
    }
    
    /*
    Gapperin väri on Magenta ja se on 10 x 10 kokoinen ovaali.
    */

    public void piirraGapper(Graphics g) {
        g.setColor(Color.MAGENTA);
        Gapper gapperi = peli.getGapper();
        g.fillOval(gapperi.getX(), gapperi.getY(), 10, 10);
    }
    
    /*
    Gapperin väri on Cyan ja se on 10 x 10 kokoinen suorakulmio.
    */
    

    public void piirraSeeker(Graphics g) {
        g.setColor(Color.CYAN);
        Seeker sipsiorkki = peli.getSeeker();
        g.fillRect(sipsiorkki.getX(), sipsiorkki.getY(), 10, 10);
    }
    
    /*
    Kentän ulkoreunat 
    korkeus on 500 ja leveys 750
    Leveyskoordinaatti alkaa pisteestä (15,15) ja päättyy pisteeseen (765,15)
    Korkeuskoordinaatti alkaa pisteestä (15,15)  ja päättyy pisteeseeen (15, 515)
    */
    

    public void piirraKentanReunat(Graphics g) {
        g.setColor(Color.RED);
        g.drawLine(15, 15, 15, 515); // vasen sivu
        g.drawLine(15, 15, 765, 15); // yläkansi
        g.drawLine(15, 515, 765, 515); // alakansi
        g.drawLine(765, 15, 765, 515); // oikea sivu

    }
    
    /*
    Kentässä 1 käytettävät sisäviivat.
    */

    public void piirraKentanSisaViivat_Level1(Graphics g) {
        g.setColor(Color.RED);
        g.drawLine(265, 15, 265, 515); // vasen pystyviiva
        g.drawLine(515, 15, 515, 515); // oikea pystyviiva
        g.drawLine(15, 170, 765, 170); // ylempi vaakaviiva
        g.drawLine(15, 340, 765, 340); // alempi vaakaviiva
    }
    
    /*
    Kentässä 2 käytettävät sisäviivat.
    */
    
    public void piirraKentanSisaViivat_Level2(Graphics g) {
        g.setColor(Color.RED);
        g.drawLine(203, 15, 203, 515); // pystyviivat
        g.drawLine(390, 15, 390, 515); 
        g.drawLine(578, 15, 578, 515); 
        
        g.drawLine(15, 140, 765, 140); // vaakaviivat
        g.drawLine(15, 265, 765, 265); 
        g.drawLine(15, 390, 765, 390); 
        
//        g.drawLine(15, 125+15, 765, 125+15); 
//        g.drawLine(15, 250+15, 765, 250+15); 
//        g.drawLine(15, 375+15, 765, 375+15); 
        

    }
    

    public void piirraPisteet(Graphics g) {
        //pistetaulun päivitys
        g.setColor(Color.WHITE);
        g.drawString("SCORE [" + peli.getPisteet() + "]", 100, 540);
        g.drawString("LIVES [" + peli.getElamat() + "]", 370, 540);
        g.drawString("LEVEL [" + peli.getKentanNumero() + "]", 610, 540);
    }
}
