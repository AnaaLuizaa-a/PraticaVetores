

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

      // Solicitar quantidade de recibos
      int recibos = 0;
        System.out.print("Digite a quantidade de recibos que deseja imprimir: ");
          recibos = entrada.nextInt();

      //imprima os números dos recibos de 1 até o número desejado 
      while (recibos > 0){
        System.out.println("Recibo: " + recibos);
        recibos--;
      }
    
      }

    }
