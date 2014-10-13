package supergapper.logiikka.liikkuja;

public class Liikkuja {

    private int x;
    private int y;
    private int nopeus;
    private Suunta suunta;
    private int kentta;

    public Liikkuja(int x, int y, Suunta suunta) {
        this.x = x;
        this.y = y;
        this.suunta = suunta;
        this.nopeus = 100; // Gapper aina nopeampi kuin Seeker tai yhtä nopea.
        this.kentta = 1;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public Suunta getSuunta() {
        return suunta;
    }

    public void setSuunta(Suunta suunta) {
        this.suunta = suunta;
    }
    
    public void setSijainti(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getNopeus() {
        return nopeus;
    }

    public void liiku() {
        tarkistaSisaSeinat_Level1();
        tarkistaUlkoSeinat();

        if (suunta == Suunta.OIKEA) {
            this.x++;

        } else if (suunta == Suunta.VASEN) {
            this.x--;

        } else if (suunta == Suunta.ALAS) {
            this.y++;

        } else if (suunta == Suunta.YLOS) {
            this.y--;

        } else if (suunta == Suunta.TYHJA) {
            return;
        }
        
    }
    
    public void tarkistaUlkoSeinat() {
        if (suunta == Suunta.OIKEA && this.x == 760) {
            setSuunta(suunta.TYHJA);
        } else if (suunta == Suunta.VASEN && this.x == 10) {
            setSuunta(suunta.TYHJA);
        } else if (suunta == Suunta.YLOS && this.y == 10) {
            setSuunta(suunta.TYHJA);
        } else if (suunta == Suunta.ALAS && this.y == 510) {
            setSuunta(suunta.TYHJA);
        }
    }
    
    public void tarkistaSisaSeinat_Level1() {
        if (saakoTastaKaantya(this.x, this.y) == true) {
            setSuunta(suunta);
        } else {
            return;
        }
    }
    
    public boolean saakoTastaKaantya(int x, int y) {
        if (x == 0 || x == 260 || x == 515 || x == 765) {
            return true;
        } else {
            return false;
        }
        
    }
//        g.drawLine(265, 15, 265, 515); // vasen pystyviiva
//        g.drawLine(515, 15, 515, 515); // oikea pystyviiva
//        g.drawLine(15, 170, 765, 170); // ylempi vaakaviiva
//        g.drawLine(15, 340, 765, 340); // alempi vaakaviiva
    
    

    public void jahtaa(Gapper gapper) {
        // Seeker käyttää jahtaa-metodia.        
        if (gapper.getX() < this.x) {
            this.x--;
        } else if (gapper.getX() > this.x) {
            this.x++;
        } else if (gapper.getY() < this.y) {
            this.y--;
        } else if (gapper.getY() > this.y) {
            this.y++;
        }
    }

//    public void pakene(Gapper gapper) {
//        // Seeker ei käytä pakene-metodia.        
//        if (gapper.getX() < this.x) {
//            this.x++;
//        } else if (gapper.getX() > this.x) {
//            this.x--;
//        } else if (gapper.getY() < this.y) {
//            this.y++;
//        } else if (gapper.getY() > this.y) {
//            this.y--;
//        }
//    }
     
}
