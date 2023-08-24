package ArteMarcial;

import java.security.Key;

public class Luta {
    private Lutador lutador1;
    private Lutador lutador2;

    public Luta(Lutador lutador1, Lutador lutador2) {
        this.lutador1 = lutador1;
        this.lutador2 = lutador2;
    }

    public Lutador getLutador1() {
        return lutador1;
    }

    public Lutador setlLutador1(Lutador lutador1) {
        this.lutador1 = lutador1;
        return lutador1;
    }

    public Lutador getLutador2() {
        return lutador2;
    }

    public Lutador setLutador2(Lutador lutador2) {
        this.lutador2 = lutador2;
        return lutador2;
    }

}
