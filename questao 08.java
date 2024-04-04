//Crie um programa que irá gerar um vetor A com 15 números inteiros e depois crie um vetor B que será a cópia do vetor A de forma reversa.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

      // Cria o vetor A com 15 números inteiros
      int[] vetorA = new int[15];
      System.out.println("Digite os 15 números inteiros para o vetor A:");
      for (int i = 0; i < vetorA.length; i++) {
          vetorA[i] = entrada.nextInt();
      }

      // Cria o vetor B como uma cópia do vetor A de forma reversa
      int[] vetorB = new int[vetorA.length];
      for (int i = 0; i < vetorA.length; i++) {
          vetorB[vetorA.length - 1 - i] = vetorA[i];
      }

      // Imprime os vetores A e B
      System.out.println("Vetor A:");
      for (int numero : vetorA) {
          System.out.print(numero + " ");
      }
      System.out.println(" ");

      System.out.println("Vetor B:");
      for (int numero : vetorB) {
          System.out.print(numero + " ");
      }
      System.out.println(" ");


      }

    }
