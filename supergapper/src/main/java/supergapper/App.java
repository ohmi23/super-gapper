package supergapper;

import javax.swing.SwingUtilities;
import supergapper.gui.Kayttoliittyma;
import supergapper.Gapperpeli;

public class App 
{
    public static void main( String[] args )
    {
        /*
        Main luokka luo ja käynnistää gapperpelin ja käyttöliittymän.
        */
        
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * ");
        System.out.println("Morjensta. Tervetuloa pelaamaan Super-Gapperia!");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * ");
        Gapperpeli gapperpeli = new Gapperpeli(1); 
        // Käynnistetään gapperpeli kentässä 1.
        
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
