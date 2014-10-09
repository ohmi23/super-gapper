package supergapper;

import javax.swing.SwingUtilities;
import supergapper.gui.Kayttoliittyma;
import supergapper.Gapperpeli;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Morjensta. Tervetuloa pelaamaan Super-Gapperia! \n ja tässä toinen rivi tekstiä hkans.");
        Gapperpeli gapperpeli = new Gapperpeli(3,3); 
        // Käynnistetään gapperpeli 3 x 3 kokoisena.
        
        Kayttoliittyma kali = new Kayttoliittyma(gapperpeli, 800, 600);
        SwingUtilities.invokeLater(kali);
        
        while (kali.getPaivitettava() == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                System.out.println("Piirtoalustaa ei ole vielä luotu.");
            }
        }
 
        gapperpeli.setPaivitettava(kali.getPaivitettava());
        gapperpeli.start();  
                
    }
}
