

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

      //solicitar preço
      double precos[]= new double [10];
      int i;
      for (i=0; i<10; i++){
        System.out.println("Digite o preço dos produtos: ");
        precos[i]=entrada.nextInt();
      }
         
      // Ordenação do vetor de preços em ordem crescente
      for (i = 0; i < precos.length; i++) {
          for (int j = i + 1; j < precos.length; j++) {
              if (precos[i] > precos[j]) {
                  double temp = precos[i];
                  precos[i] = precos[j];
                  precos[j] = temp;
              }
          }
      }

      // Impressão do vetor ordenado
      System.out.println("Preços ordenados em ordem crescente:");
      for (double preco : precos) {
          System.out.printf("%.2f\n", preco);
      }
      }
    }


    
