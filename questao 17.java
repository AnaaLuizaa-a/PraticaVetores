

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

      //solicitar nota
      double nota []= new double [10];
      int i;
      for (i=0; i<10; i++){
        System.out.println("Digite a nota: ");
        nota[i]=entrada.nextDouble();
      }
         
      // calcular média das notas
      double soma=0;
      for (i=0; i<10; i++){
        soma=soma+nota[i];
      }
      double media=soma/10;
      System.out.print("A média das notas é: "+media);
      }
      }

    
