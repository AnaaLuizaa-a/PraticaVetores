

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

      //solicitar preço
      double entradas[]= new double [5];
      double saida[]= new double [5];
      int i;
      for (i=0; i<5; i++){
        System.out.println("Digite os valores de entrada: ");
        entradas[i]=entrada.nextDouble(); }
      for (i=0; i<5; i++){
      System.out.println("Digite os valores de saída: ");
      saida[i]=entrada.nextDouble();}
         //saldo total
        double saldo=0;
        for (i=0;i<5;i++){
          saldo=saldo+entradas[i]-saida[i];
        }
      System.out.print("O saldo total é: "+saldo);
      }
    }


    
