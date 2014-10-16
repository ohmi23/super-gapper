package supergapper.logiikka.liikkuja;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LiikkujaTest {
    
    private Gapper gapper;
    private Seeker seeker;
    
    public LiikkujaTest() {
        this.gapper = new Gapper(10,10, Suunta.OIKEA, 1);
        this.seeker = new Seeker(760,510, Suunta.VASEN, 1);
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
    public void onkoGapperinSuuntaOikea() {
        assertTrue(gapper.getSuunta() == Suunta.OIKEA);
    }
    
    @Test
    public void liikuTestEteenpäin() {
        gapper.liiku();
        assertTrue(gapper.getX() == 11);
    }
    
//    @Test
//    public void liikuTestUlkoSeinaaPain() {
//        gapper.setSuunta(Suunta.VASEN);
//        gapper.liiku();
//        gapper.liiku();
//        assertTrue(gapper.getX() == 10);
//    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
