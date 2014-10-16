package supergapper.logiikka.liikkuja;

/**
 * Liikkuja-luokka on luokka jonka ilmentymiä Gapper ja Seeker molemmat ovat.
 *
 */
public class Liikkuja {

    /**
     * Liikkujalla on sijainnin ja suunnan ilmaisevat parametrit.
     *
     * @param int x sijanti x-akselilla
     * @param int y sijanti y-akselilla
     * @param Suunta enum
     */
    private int x;
    private int y;
    private int nopeus;
    private Suunta suunta;
    private Suunta uusisuunta;
    private int kentta;

    public Liikkuja(int x, int y, Suunta suunta, int kentta) {
        this.x = x;
        this.y = y;
        this.suunta = suunta;
        this.uusisuunta = suunta;
        this.nopeus = 100; // Gapper aina nopeampi kuin Seeker tai yhtä nopea.
        this.kentta = kentta;
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

    public Suunta getUusiSuunta() {
        return uusisuunta;
    }

    public void setUusiSuunta(Suunta suunta) {
        this.uusisuunta = suunta;
    }

    public void setSijainti(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getNopeus() {
        return nopeus;
    }

    /**
     * Liiku-metodi tarkistaa ensin ollaanko kentän sisäpuolella tai reunoilla.
     * Sitten tarkistetaan ollaanko sisäseinien suhteen oikeilla raiteilla. Jos
     * ehdot täyttyvät, liikutaan annettuun suuntaan yksi pikseli. Jos suunta on
     * tyhjä, ei liikuta. 
     * 
     * On tärkeää että liiku-metodissa tarkistetaan 
     * ensin sisäseinä ja sitten vasta ulkoseinä.
     */
    public void liiku() {
        tarkistaSisaSeinat(suunta, this.kentta);
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

    /**
     * liiku-metodin apumetodi
     * seinät ovat samassa paikassa kentästä riippumatta joten
     * samaa metodia voidaan käyttää kaikille kentille.
     */
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

    /**
     * liiku-metodin apumetodi joka tietää missä kentässä ollaan.
     */
    public void tarkistaSisaSeinat(Suunta suunta, int kentta) {
        if (kentta == 1) {
            if (saakoTastaKaantya_Level1(this.x, this.y, suunta, uusisuunta) == true) {
                setSuunta(uusisuunta);
            } else {
                setSuunta(suunta);
            }
        } else if (kentta == 2) {
            if (saakoTastaKaantya_Level2(this.x, this.y, suunta, uusisuunta) == true) {
                setSuunta(uusisuunta);
            } else {
                setSuunta(suunta);
            }
            
        }

    }

    /**
     * apumetodi kentälle 1.
     */
    public boolean saakoTastaKaantya_Level1(int x, int y, Suunta suunta, Suunta uusisuunta) {
        boolean ok;

        if ((x == 10 || x == 260 || x == 510 || x == 760) && (y == 10 || y == 165 || y == 335 || y == 510)) {
            ok = true;
        } else {
            ok = false;
        }
        
        if (suunta == suunta.YLOS && uusisuunta == uusisuunta.ALAS) {
            ok = true;
        } else if (suunta == suunta.ALAS && uusisuunta == uusisuunta.YLOS) {
            ok = true;
        } else if (suunta == suunta.VASEN && uusisuunta == uusisuunta.OIKEA) {
            ok = true;
        }  else if (suunta == suunta.OIKEA && uusisuunta == uusisuunta.VASEN) {
            ok = true;
        }  else if (suunta == suunta.TYHJA) {
            ok = true;
        }
        
        return ok;

    }
    
    /**
     * apumetodi kentälle 2.
     */
    
    
    public boolean saakoTastaKaantya_Level2(int x, int y, Suunta suunta, Suunta uusisuunta) {
        boolean ok;
        if ((x == 10 || x == 203 || x == 390 || x == 578 || x == 760) && (y == 10 ||  y == 140 || y == 265 || y == 390 || y == 510)) {
            ok = true;
        } else {
            ok = false;
        }
        
        if (suunta == suunta.YLOS && uusisuunta == uusisuunta.ALAS) {
            ok = true;
        } else if (suunta == suunta.ALAS && uusisuunta == uusisuunta.YLOS) {
            ok = true;
        } else if (suunta == suunta.VASEN && uusisuunta == uusisuunta.OIKEA) {
            ok = true;
        }  else if (suunta == suunta.OIKEA && uusisuunta == uusisuunta.VASEN) {
            ok = true;
        }  else if (suunta == suunta.TYHJA) {
            ok = true;
        }
        
        return ok;
        
//        g.drawLine(203, 15, 203, 515); // pystyviivat y
//        g.drawLine(390, 15, 390, 515); 
//        g.drawLine(578, 15, 578, 515); 
//        
//        g.drawLine(15, 140, 765, 140); // vaakaviivat x
//        g.drawLine(15, 265, 765, 265); 
//        g.drawLine(15, 390, 765, 390); 
        

    }
    

    /**
     * Seekerin "tekoälyn" sisältävä jahtausmetodi. Seeker näkee missä gapper on
     * ja suuntaa itsensä siihen suuntaan.
     *
     * @param Gapper gapper
     */
    public void jahtaa(Gapper gapper) {
        if ((gapper.getX() < this.x)) {
            this.uusisuunta = suunta.VASEN;
        } else if ((gapper.getX() > this.x)) {
            this.uusisuunta = suunta.OIKEA;
        } else if ((gapper.getY() < this.y)) {
            this.uusisuunta = suunta.YLOS;
        } else if ((gapper.getY() > this.y)) {
            this.uusisuunta = suunta.ALAS;
        } else {
            this.uusisuunta = suunta.TYHJA;
        }
        liiku();

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
