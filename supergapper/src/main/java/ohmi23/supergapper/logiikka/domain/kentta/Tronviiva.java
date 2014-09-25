package ohmi23.supergapper.logiikka.domain.kentta;

public class Tronviiva {
    
    private int[] resoluutio = new int[8];
    
    public Tronviiva() {
        
    }
    
    public void setTrue() {
        for (int i = 0; i < resoluutio.length; i++) {
            resoluutio[i] = 1;
        }
    }
}
