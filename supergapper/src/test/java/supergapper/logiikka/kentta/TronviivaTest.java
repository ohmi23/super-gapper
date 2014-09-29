package supergapper.logiikka.kentta;

import supergapper.logiikka.kentta.Tronviiva;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TronviivaTest {
    
    private Tronviiva tronviiva;
    
    public TronviivaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    
    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        Tronviiva tronviiva = new Tronviiva();
    }
    
    @After
    public void tearDown() {
    }
    
//    @Test
//    public void taulukkoTesti() {
//        boolean tulikotaulukkotayteen = false;
//        this.tronviiva.setTrue();
//        
//        assertTrue(tulikotaulukkotayteen);        
//    }
    
    
    @Test
    public void onkoTaulukonkokoOikea() {
        Tronviiva tronviiva = new Tronviiva();
        int vastaus = tronviiva.getResoluutio();
        
        assertEquals(8, vastaus);
    }
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
