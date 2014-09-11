package ohmi23.supergapper;

public class Liikkuja {

    int x;
    int y;
    int nopeus;

    public Liikkuja(int x, int y) {
        this.x = x;
        this.y = y;
        this.nopeus = 1; // Gapper aina nopeampi kuin Seeker tai yhtä nopea.
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public int getNopeus() {
        return nopeus;
    }
        
}
