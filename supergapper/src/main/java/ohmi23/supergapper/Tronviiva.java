package ohmi23.supergapper;

public class Tronviiva {
    
    public int[] resoluutio = new int[8]; // viiva koostuu int-taulukosta - koko on aina 8
    public boolean pystyssa;  // onko pystyviiva vai vaakaviiva?
    public int koordinaattiX; // sijainti koordinaatissa/tiilessä x,y?
    public int koordinaattiY;
    
    
    public Tronviiva(int koordinaattiX, int koordinaattiY, boolean pystyssa) {
        this.pystyssa = true;
        this.koordinaattiX = 0;
        this.koordinaattiY = 0;
        // taulukko alustuu oletuksena nollaan.
        
    }
    
    // to do: Lista viivan kohdista joissa on jo käyty.
       
    
}
