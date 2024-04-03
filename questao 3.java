import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vetor1 = new int[10];
        double soma=0;

        // Preenche o primeiro vetor com dez números inteiros
      for (int i = 0; i < vetor1.length; i++) {
      System.out.printf("Digite o %dº número do primeiro vetor: ", i + 1);
      vetor1[i] = entrada.nextInt();
        }

      // Soma dos elementos do vetor
      for (int i = 0; i < vetor1.length; i++) {
          soma += vetor1[i];
      }

      // Imprime a soma dos elementos do vetor
        double media=soma/10;
      System.out.println("A média dos elementos do vetor é: " + media);
    }
}
