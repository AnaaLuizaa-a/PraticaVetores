//Escreva um programa em java que preencha um vetor com 20 números inteiros aleatórios entre 1 e 30 e depois verifique se o número 25 existe neste vetor. 
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
      // Cria um vetor com 20 números inteiros aleatórios entre 1 e 30
      int[] vetor = new int[20];
      Random random = new Random();
      for (int i = 0; i < vetor.length; i++) {
          vetor[i] = random.nextInt(30) + 1;
      }

      // Imprime o vetor
      System.out.println("Vetor:");
      for (int numero : vetor) {
          System.out.print(numero + " ");
      }
      System.out.println();

        // Verifica se o número 25 existe no vetor
        boolean numero25Existe = false;
        for (int numero : vetor) {
            if (numero == 25) {
                numero25Existe = true;
                break;
            }
        }

        // Imprime o resultado
        if (numero25Existe) {
            System.out.println("O número 25 existe no vetor.");
        } else {
            System.out.println("O número 25 não existe no vetor.");
        }
    }
}