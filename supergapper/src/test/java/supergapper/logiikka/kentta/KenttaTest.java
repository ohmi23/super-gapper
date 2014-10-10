package supergapper.logiikka.kentta;

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
public class KenttaTest {
    
    private Kentta kentta;
    
    public KenttaTest() {
        this.kentta = new Kentta(800, 600);

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
    public void luoRuudutJaViivatTestRuuduille_Level_1() {
        kentta.luoKentta(1);
        assertTrue(kentta.getRuutujenMaara() == 9);
    }
    
    @Test
    public void luoRuudutJaViivatTestRuuduille_Level_2() {
        kentta.luoKentta(2);
        assertTrue(kentta.getRuutujenMaara() == 16);
    }
    
    @Test
    public void luoRuudutJaViivatTestViivoille_Level_1() {
        kentta.luoKentta(1);
        assertTrue(kentta.getViivojenMaara() == 24);
    }
    
    @Test
    public void luoRuudutJaViivatTestViivoille_Level_2() {
        kentta.luoKentta(2);
        assertTrue(kentta.getViivojenMaara() == 40);
    }
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
