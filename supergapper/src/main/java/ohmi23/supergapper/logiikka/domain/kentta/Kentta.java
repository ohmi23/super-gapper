package ohmi23.supergapper.logiikka.domain.kentta;

import java.util.ArrayList;
import java.util.List;

public class Kentta {
    
    private int leveys;
    private int korkeus;
    private List<Ruutu> ruudut;
    private List<Tronviiva> tronviivat;
    

    public Kentta(int leveys, int korkeus) {
        this.leveys = leveys;
        this.korkeus = korkeus;
        this.ruudut = new ArrayList<Ruutu>();
    }
    
   public void luoKentta(int leveys, int korkeus) {        
        luoRuudutJaViivat(this.leveys, this.korkeus);
   }
    
    
    public void luoRuudutJaViivat(int leveys, int korkeus) {
        for (int i = 0; i < leveys*korkeus; i++) { // 3 x 3 kenttä -> 9 ruutua 
                this.ruudut.add(new Ruutu());
        }
        
        for (int i = 0; i < (leveys*korkeus*2+2*korkeus); i++) { // 24 tronviivaa.
                tronviivat.add(new Tronviiva());
        }
        
    }
}
