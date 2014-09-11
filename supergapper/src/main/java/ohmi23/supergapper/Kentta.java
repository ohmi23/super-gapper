package ohmi23.supergapper;

import java.util.ArrayList;
import java.util.List;

public class Kentta {
    
    private int leveys;
    private int korkeus;
    private List<Tronviiva> tronviivat; // Tietorakenne mietinnässä. Ei välttämättä lista.
    
    // Kenttä tietää kokonsa ja koostuu tronviivoista.
    // Esim 3 x 3 kenttä sis. 24 tronviivaa.
    

    public Kentta(int leveys, int korkeus) {
        this.leveys = leveys;
        this.korkeus = korkeus;
        this.tronviivat = new ArrayList<Tronviiva>();
    }
            
           
    
}
