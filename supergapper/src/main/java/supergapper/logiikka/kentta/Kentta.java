package supergapper.logiikka.kentta;

import java.util.ArrayList;
import java.util.List;

public class Kentta {

    private int leveys; // 800
    private int korkeus; // 600
    private List<Ruutu> ruudut;
    private List<Tronviiva> tronviivat;
    private int ruutujenMaara;
    private int viivojenMaara;

    public Kentta(int leveys, int korkeus) {
        this.leveys = leveys;
        this.korkeus = korkeus;
        this.ruudut = new ArrayList<Ruutu>();
        this.tronviivat = new ArrayList<Tronviiva>();
        this.ruutujenMaara = 9;
        this.viivojenMaara = 24;
    }

    public void luoKentta(int kentanNumero) {
        if (kentanNumero == 1) {
            this.ruutujenMaara = 9;
            this.viivojenMaara = 24;
            luoRuudutJaViivat(this.ruutujenMaara, this.viivojenMaara);
        } else if (kentanNumero == 2) {
            this.ruutujenMaara = 16;
            this.viivojenMaara = 40;
            luoRuudutJaViivat(this.ruutujenMaara, this.viivojenMaara);
        } else {
            this.ruutujenMaara = 9;
            this.viivojenMaara = 24;
            return;
        }
    }

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
}
