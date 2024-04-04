import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Cria um vetor com 5 números decimais
        double[] vetor = new double[5];
      // Entrada dos números
      System.out.println("Digite os 5 números decimais:");
      for (int i = 0; i < vetor.length; i++) {
          vetor[i] = entrada.nextDouble();
      }

      // Encontra o maior e o menor valor
      double maiorValor = vetor[0];
      double menorValor = vetor[0];
      for (double numero : vetor) {
          if (numero > maiorValor) {
              maiorValor = numero;
          }
          if (numero < menorValor) {
              menorValor = numero;
          }
      }

      // Imprime o maior e o menor valor
      System.out.println("Maior valor: " + maiorValor);
      System.out.println("Menor valor: " + menorValor);
    }
}
