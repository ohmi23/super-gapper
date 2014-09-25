package ohmi23.supergapper.logiikka.domain.kentta;

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
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
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
        assertEquals("Taulukon koko on kahdeksan", tronviiva.toString().equals("8"));
    }
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
