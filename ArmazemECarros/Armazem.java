package ArmazemECarros;

import java.util.ArrayList;

public class Armazem {
    private ArrayList<Carros> ListaDeCarros;

    public Armazem(){
        this.ListaDeCarros = new ArrayList<>();
        adicionarCarros();

    }
    public void  adicionarCarros(){
        this.ListaDeCarros.add(new Carros(1,"BMW", "600 KM", "PRETO AVERMELHADO"));
        this.ListaDeCarros.add(new Carros(2,"FERRARI", "20 KM", "VINHO"));
        this.ListaDeCarros.add(new Carros(3,"FUSCA", "800 KM", "VERDE"));
    }
    public Carros getCarroPorIndice(int indice) {
        if(indice >= 0 && indice < ListaDeCarros.size()){
            return ListaDeCarros.get(indice);
        }
        return null;
    }
}
