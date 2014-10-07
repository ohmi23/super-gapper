package supergapper.logiikka.liikkuja;
    
public enum Suunta {
 
    /*
    Näppäimistönkuuntelijaa varten suunta-enumit, 
    TYHJA on tyhjakäynti jossa ei liikuta vaan ollaan paikallaan 
    paikallaan tarvii olla kun osuu seinään.
    */
    
    YLOS(0, -1),
    ALAS(0, 1),
    OIKEA(1, 0),
    VASEN(-1, 0),
    TYHJA(0, 0);

    private int dx;
    private int dy;

    private Suunta(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }
}
