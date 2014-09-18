package ohmi23.supergapper;

import java.util.ArrayList;
import java.util.List;

public class Kentta {
    
    private int leveys;
    private int korkeus;
    private List<Tronviiva> tronviivat; // Tietorakenne mietinnässä. Ei välttämättä lista.
    
    // Kenttä tietää kokonsa ja koostuu ruuduista joita ympäröivät tronviivat.
    // Esim 3 x 3 kenttä sis. 24 tronviivaa.
    
    
    // to do: vaihdetaan tähän luokkaan tronviivojen tilalle ruudut.

    public Kentta(int leveys, int korkeus) {
        this.leveys = leveys;
        this.korkeus = korkeus;
        this.tronviivat = new ArrayList<Tronviiva>();
    }
    
    public void luoKentta(int leveys, int korkeus) {        
        // luodaan pystyviivat (x: 0-3, y: 0-2) = 12kpl
        for (int i = 0; i < korkeus; i++) {
           tronviivat.add(new Tronviiva(i,0, true));
           tronviivat.add(new Tronviiva(i,1, true));
           tronviivat.add(new Tronviiva(i,2, true));
        }
        
        // luodaan vaakaviivat (x: 0-2, y: 0-3) = 12 kpl
        for (int i = 0; i < leveys; i++) {
            tronviivat.add(new Tronviiva(0,i, false));
            tronviivat.add(new Tronviiva(1,i, false));
            tronviivat.add(new Tronviiva(2,i, false));
        }        
    }
    
    
            
           
    
}
