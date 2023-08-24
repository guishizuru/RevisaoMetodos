package ArteMarcial;

import ArteMarcial.ArteMarcial;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Lutador lutador1 = new Lutador(1,"ryan", new ArrayList<>());
        Lutador lutador2 = new Lutador(2,"Luan", new ArrayList<>());

        lutador1.getArteMarcials().add(new ArteMarcial(1,"karate"));
        lutador2.getArteMarcials().add(new ArteMarcial(2,"Muay thai"));
        Luta luta = new Luta(lutador1, lutador2);

        System.out.println(luta.getLutador1().getArteMarcials().get(0).getNome());
        System.out.println(luta.getLutador1().getArteMarcials().get(0).getNome());

    }
}

