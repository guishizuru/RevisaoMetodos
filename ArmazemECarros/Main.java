package ArmazemECarros;

public class Main {
    public static void main(String[] args) {
      Armazem armazem = new Armazem();
      Carros carroEscolhido = armazem.getCarroPorIndice(2);
      if(carroEscolhido != null){
          System.out.println(carroEscolhido);
      }else {
          System.out.println("Indice inválido.");
      }
    }
}