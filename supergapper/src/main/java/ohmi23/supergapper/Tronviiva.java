package ohmi23.supergapper;

public class Tronviiva {
    
    public int koko;
    public boolean valmis;    // onko kokonaan väritetty? ei oikeasti boolean vaan resoluutio!
    public boolean pystyssa;  // onko pystyviiva vai vaakaviiva?
    public int koordinaattiX; // sijainti kentässä?
    public int koordinaattiY;
    

    public Tronviiva(int koordinaattiX, int koordinaattiY, boolean pystyssa) {
        this.valmis = false;
        this.pystyssa = true;
        this.pystyssa = pystyssa;
        this.koordinaattiX = 0;
        this.koordinaattiY = 0;
        
        
    }
    
    // to do: Lista viivan kohdista joissa on jo käyty.
       
    
}
