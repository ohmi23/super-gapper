package supergapper.logiikka.kentta;

/**
 * Tronviiva-luokka
 * 
 */

public class Tronviiva {
    
    private int[] resoluutio;

    public Tronviiva() {
        this.resoluutio = new int[8];
        
    }

    public void setTrue() {
        for (int i = 0; i < resoluutio.length; i++) {
            resoluutio[i] = 1;
        }
    }
    
    public void setFalse() {
        for (int i = 0; i < resoluutio.length; i++) {
            resoluutio[i] = 0;
        }
    }
    
    public void setResoluutio(int[] resoluutio) {
        this.resoluutio = resoluutio;
    }

    public int getResoluutio() {
        return this.resoluutio.length;
    }
    
    @Override
    public String toString() {
        String palautusarvo = ""+resoluutio.length;
        return palautusarvo;
    }
    
 
}
