package supergapper.logiikka.liikkuja;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author OA
 */
public class SuuntaTest {
    
    private Suunta suunta;
    
    public SuuntaTest() {
        this.suunta = suunta.TYHJA;
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
    public void onkoSuuntaAlussaTyhja() {
        assertTrue(suunta == suunta.TYHJA);
    }
    
    @Test
    public void onkoSuuntaOikea() {
        this.suunta = suunta.OIKEA;
        assertTrue(suunta == suunta.OIKEA);
    }
    
    @Test
    public void onkoSuuntaVasen() {
        this.suunta = suunta.VASEN;
        assertTrue(suunta == suunta.VASEN);
    }
    
    @Test
    public void onkoSuuntaYlos() {
        this.suunta = suunta.YLOS;
        assertTrue(suunta == suunta.YLOS);
    }
    
    @Test
    public void onkoSuuntaAlas() {
        this.suunta = suunta.ALAS;
        assertTrue(suunta == suunta.ALAS);
    }
    
    @Test
    public void onkoSuuntaOikeaSarja1() {
        this.suunta = suunta.YLOS;
        this.suunta = suunta.ALAS;
        this.suunta = suunta.YLOS;
        this.suunta = suunta.ALAS;
        this.suunta = suunta.OIKEA;
        assertTrue(suunta == suunta.OIKEA);
    }
    
    @Test
    public void onkoSuuntaOikeaSarja2() {
        this.suunta = suunta.VASEN;
        this.suunta = suunta.ALAS;
        this.suunta = suunta.OIKEA;
        this.suunta = suunta.YLOS;
        this.suunta = suunta.OIKEA;
        assertTrue(suunta == suunta.OIKEA);
    }

    
    
}
