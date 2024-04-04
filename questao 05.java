//Escreva um programa em java que preencha um vetor com 15 números inteiros aleatórios entre 1 e 50. Verifique se o número 20 existe nesse vetor e retorne seu índice caso ele exista. 

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
      // Cria um vetor com 15 números inteiros
      int[] vetor = new int[15];
      int i=0;
      //entrada dos números 
      for (i = 0; i < vetor.length; i++){
        System.out.print("Digite o " + (i+1) + "º número: ");
        vetor[i] = entrada.nextInt();
      }

        // Verifica se o número 20 existe no vetor
        boolean numero20Existe = false;
        for (i = 0; i < vetor.length; i++){
            if (vetor[i] == 20) {
                numero20Existe = true;
                break;
            }
        }

        // Imprime o resultado e posição no vetor do número 20
        if (numero20Existe) {
            System.out.println("O número 20 existe no vetor. E está na posição: " + i + " do vetor");
        } else {
            System.out.println("O número 20 não existe no vetor.");
        }
    }
}