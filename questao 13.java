

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

      //solicitar um número
      int numero = 0;
          System.out.println("Digite um número: ");
      numero=entrada.nextInt();
      //imprimir todos os numeros primos menores ou iguais ao numero
      for (int i=0; i<=numero;i++){
        if (i%2!=0){
          System.out.println(i);
        }
      }
              
      }
      }

    
