

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

      //solicitar um número
      int numero = 0;
          System.out.println("Digite um número: ");
      numero=entrada.nextInt();
      // Verifica se o número inserido é válido
      if (numero <= 0) {
          System.out.println("Número inválido. Insira um número inteiro positivo.");
          return;
      }

      // Inicializa os primeiros dois termos da sequência de Fibonacci
      int a = 0;
      int b = 1;

      // Gera e imprime os N primeiros termos da sequência de Fibonacci
      System.out.println("Os primeiros " + numero + " termos da sequência de Fibonacci são:");
      for (int i = 0; i < numero; i++) {
          System.out.println(a);

          // Calcula o próximo termo da sequência
          int c = a + b;

          // Atualiza os valores de a e b
          a = b;
          b = c;
      }

              
      }
      }

    
