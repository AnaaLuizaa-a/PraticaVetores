

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

      // Solicitar temperatura
      int temp[] =  new int[10];
        System.out.print("Digite 10 valores de temperatura: ");
      for (int i=0; i<10; i++){
          temp [i] = entrada.nextInt();}
      double soma = 0;
      

      for(int i=0;i<10;i++){
        soma += temp[i];
      }
      double media = soma/10;
      System.out.println("A média de temperatura dessas 10 regiões é: " + media);


      
    
      }

    }
