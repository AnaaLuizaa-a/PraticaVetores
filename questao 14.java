

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

      //solicitar um número
      int numero = 0;
          System.out.println("Digite o número de etapas da produção: ");
      numero=entrada.nextInt();
      //calcular tempo de produção
      int tempo = 30;
      int tempoTotal = tempo * numero;
      //imprimir tempo de produção
      System.out.println("O tempo de produção será de: " + tempoTotal + " minutos");


              
      }
      }

    
