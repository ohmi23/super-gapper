package supergapper.logiikka.pisteet;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author olantika
 */
public class PistelaskuriTest {
    
    private Pistelaskuri pistelaskuri;
    
    public PistelaskuriTest() {
        this.pistelaskuri = new Pistelaskuri();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void onkoKenttaAlussaYkkonen() {
        int vastaus = pistelaskuri.kentanNumero;
        assertEquals(1, vastaus);
    }
    
    @Test
     public void onkoPisteetAlussaNolla() {
         int vastaus = pistelaskuri.pisteet;
         assertEquals(0, vastaus);
    }

    @Test
     public void onkoElamatAlussaKolme() {
         int vastaus = pistelaskuri.elamat;
         assertEquals(3, vastaus);
    }
     
    @Test
    public void voikoKenttaOllaAlleYkkosen() {
        assertTrue(pistelaskuri.kentanNumero > 0);
    }
    
    @Test
    public void voikoPisteetOllaAlleNollan() {
        assertTrue(pistelaskuri.pisteet >= 0);
    }
     
    @Test
    public void voikoElamatOllaAlleNollan() {
        assertTrue(pistelaskuri.elamat >= 0);
    }
    
    @Test
    public void kenttaKasvaaKasvatettaessaYhdella() {
        pistelaskuri.seuraavaKentta();
        assertEquals(2, pistelaskuri.kentanNumero);
    }
    
    @Test
    public void tavallisetPisteetKasvavatNormaalisti() {
        pistelaskuri.lisaaNormaalitPisteet();
        assertEquals(50, pistelaskuri.pisteet);
    }
    
    @Test
    public void erikoisPisteetKasvavatNormaalisti() {
        pistelaskuri.lisaaErikoisPisteet();
        assertEquals(100, pistelaskuri.pisteet);
    }
    
    
}
