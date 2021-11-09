package sorteio;

import java.util.Random;
import java.util.Scanner;

public class Sorteio {

    public static void main (String[] args){

        Random gerador = new Random();

        Scanner leia = new Scanner(System.in);

        int numTentativas = 0;

        int y = gerador.nextInt(49);

        y = y + 1;

        for (int tentUser = 0; tentUser != y; numTentativas++){
            System.out.println("\nCite um número: ");
            tentUser = leia.nextInt();

            if (tentUser < y){
                System.out.println("DICA: O número sorteado é maior, tente novamente");
            } else if (tentUser > y){
                System.out.println("DICA: É um valor menor, tente novamente");
            } else {
                System.out.println("\nAcertou, Muito bem");
                System.out.printf("Você tentou: %d vezes", (numTentativas + 1));
            }
        }
    }

}
