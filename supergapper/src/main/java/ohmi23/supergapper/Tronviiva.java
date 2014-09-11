package ohmi23.supergapper;

public class Tronviiva {
    
    public int koko;
    public boolean valmis;    // onko kokonaan väritetty?
    public boolean pystyssa;  // onko pystyviiva vai vaakaviiva?
    public int koordinaattiX; // sijainti kentässä?
    public int koordinaattiY;
    

    public Tronviiva(int koko, int koordinaattiX, int koordinaattiY) {
        this.koko = koko;
        this.valmis = false;
        this.pystyssa = true;
        this.koordinaattiX = 0;
        this.koordinaattiY = 0;
        
    }
    
    // to do: Lista viivan kohdista joissa on jo käyty.
       
    
}
