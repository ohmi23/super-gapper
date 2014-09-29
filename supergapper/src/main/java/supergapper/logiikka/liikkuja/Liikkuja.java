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
        this.nopeus = 1; // Gapper aina nopeampi kuin Seeker tai yhtä nopea.
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
        
    }
    
        
}
