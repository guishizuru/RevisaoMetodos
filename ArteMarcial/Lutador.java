package ArteMarcial;

import ArteMarcial.ArteMarcial;

import java.util.ArrayList;

public class Lutador {
    private int id;
    private String nome;
    private ArrayList<ArteMarcial> arteMarcials;

    public Lutador(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public Lutador(int id, String nome, ArrayList<ArteMarcial> arteMarcials) {
        this.id = id;
        this.nome = nome;
        this.arteMarcials = arteMarcials;
    }


    public void adicionaerArteMarcial(ArteMarcial arteMarcial){
        this.arteMarcials.add(arteMarcial);
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setArteMarcials(ArrayList<ArteMarcial> arteMarcials) {
        this.arteMarcials = arteMarcials;
    }

    public ArrayList<ArteMarcial> getArteMarcials() {
        return arteMarcials;
    }
}