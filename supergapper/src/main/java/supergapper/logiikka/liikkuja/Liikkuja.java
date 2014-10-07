package supergapper.logiikka.liikkuja;

public class Liikkuja {

    private int x;
    private int y;
    private int nopeus;
    private Suunta suunta;

    public Liikkuja(int x, int y, Suunta suunta) {
        this.x = x;
        this.y = y;
        this.suunta = suunta;
        this.nopeus = 100; // Gapper aina nopeampi kuin Seeker tai yhtä nopea.
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Suunta getSuunta() {
        return suunta;
    }

    public void setSuunta(Suunta suunta) {
        this.suunta = suunta;
    }

    public int getNopeus() {
        return nopeus;
    }

    public void liiku() {

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

    public void jahtaa(Gapper gapper) {
        // Seeker käyttää jahtaa-metodia.        
        if (gapper.getX() < this.x) {
            this.x--;
        } else if (gapper.getX() > this.x) {
            this.x++;
        } else if (gapper.getY() < this.y) {
            this.y--;
        } else if (gapper.getY() > this.y)  {
            this.y++;
        }

    }

}
