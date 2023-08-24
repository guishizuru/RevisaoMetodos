package ArmazemECarros;

public class Carros {
    private int id;
    private String nome;
    private String velocidade;
    private String cor;

    public Carros(){

    }
    public Carros(int id, String nome, String velocidade, String cor){
        this.cor = cor;
        this.id = id;
        this.nome = nome;
        this.velocidade = velocidade;

    } public String toString(){
        return "Carro escolhido: \n" +
                "ID : " + id + "\n" +
                "Marca: " + nome + "\n" +
                "Quilometrado: " + velocidade + "\n" +
                "Cor: " + cor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }
}
