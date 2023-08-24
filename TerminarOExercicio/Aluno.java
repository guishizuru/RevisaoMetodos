package TerminarOExercicio;

//NÃO CONSEGUI RESOLVER . RESOLVER OUTRA HORA .
import java.util.ArrayList;

public class Aluno {
    private int id;
    private String nome ;
    private int idade;
    private double nota;
    private  ArrayList<Aluno> listaDeAlunos;
    public Aluno (int id ,String nome, int idade, double nota){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }
    public Aluno(){
       this.listaDeAlunos = new  ArrayList<>();
       imprimirInformacoes();
   }

    public int imprimirInformacoes() {
        this.listaDeAlunos.add(new Aluno(1,"Joao", 16, 2.5));
        this.listaDeAlunos.add(new Aluno(2,"Jorge", 17, 7.5));
        this.listaDeAlunos.add(new Aluno(3,"Cleber", 14, 5.5));

        return imprimirInformacoes();
    }
     public  Aluno getCarroPorIndice(int indice, ArrayList<Aluno> listaDeAlunos) {
            if(indice >= 0 && indice < listaDeAlunos.size()){
                return listaDeAlunos.get(indice);
            }
            return null;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() { return nome; }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
