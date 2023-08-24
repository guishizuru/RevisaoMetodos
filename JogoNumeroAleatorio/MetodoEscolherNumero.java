package JogoNumeroAleatorio;

import java.util.Random;
import java.util.Scanner;

public class MetodoEscolherNumero {
    public static void main(String[] args) throws InterruptedException {
        int numeroAleatorio;
        int numeroDeTentativas = 5;
        int contador = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        numeroAleatorio = random.nextInt(5);

        for (int i = 0; i <= numeroDeTentativas; i++) {
       System.out.println("Digite um numero que você deduz que a maquina pode ter escolhido de 0 a 5. "
       +"\n---------Você tem 3 tentativas-------------------------------------------------------"+
               "\nNumero de Tentativa : " + contador);
            Thread.sleep(1000);
        int resposta = scanner.nextInt();



            Thread.sleep(1000);
            if (resposta == numeroAleatorio) {
                System.out.println("PARABÉNS - Você foi capaz de acertar o numero correto");
                break;
            } else {
                System.out.println("Infelizmente nao teve ainda a capacidade, tente novamente"
                       + "\n===============================================================");

               contador++;
            }
        }
    }
}


