package supergapper.logiikka.kentta;

import java.util.ArrayList;
import java.util.List;

public class Kentta {

    private int leveys; // 800
    private int korkeus; // 600
    private int ruutujenMaara;
    private int viivojenMaara;
    private List<Ruutu> ruudut;
    private List<Tronviiva> tronviivat;
    

    public Kentta(int leveys, int korkeus) {
        this.leveys = leveys;
        this.korkeus = korkeus;
        this.ruutujenMaara = 9;
        this.viivojenMaara = 24;
        this.ruudut = new ArrayList<Ruutu>();
        this.tronviivat = new ArrayList<Tronviiva>();
    }

    public void luoKentta(int kentanNumero) {
        if (kentanNumero == 1) {
            setRuutujenMaara(9);
            setViivojenMaara(24);
            luoRuudutJaViivat(this.ruutujenMaara, this.viivojenMaara);
        } else if (kentanNumero == 2) {
            setRuutujenMaara(16);
            setViivojenMaara(40);
            luoRuudutJaViivat(this.ruutujenMaara, this.viivojenMaara);
        } else {
            setRuutujenMaara(9);
            setViivojenMaara(24);
            luoRuudutJaViivat(this.ruutujenMaara, this.viivojenMaara);
        }
    }
    
    /*
    luoRuudutJaViivat-metodi luo kaksi listaa.
    Yhden ruutuja varten.
    Yhden viivoja varten.
    */

    public void luoRuudutJaViivat(int ruutujenMaara, int viivojenMaara) {
 
        for (int i = 0; i < ruutujenMaara; i++) { 
            this.ruudut.add(new Ruutu());
        }

        for (int i = 0; i < viivojenMaara; i++) {
            tronviivat.add(new Tronviiva());
        }
    }

    public void listaaTronviivat() {
        for (int i = 0; i < tronviivat.size(); i++) {
            tronviivat.get(i).toString();
        }
    }
    
    /*
    Getterit
    */
    
    
    public int getRuutujenMaara() {
        return ruutujenMaara;
    }
    
    public int getViivojenMaara() {
        return viivojenMaara;
    }
    
    /*
    Setterit
    */

    public void setRuutujenMaara(int ruutujenMaara) {
        this.ruutujenMaara = ruutujenMaara;
    }

    public void setViivojenMaara(int viivojenMaara) {
        this.viivojenMaara = viivojenMaara;
    }
    
    
}
