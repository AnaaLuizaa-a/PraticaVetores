import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetorResultante = new int[20];

        // Preenche o primeiro vetor com dez números inteiros
        for (int i = 0; i < vetor1.length; i++) {
            System.out.printf("Digite o %dº número do primeiro vetor: ", i + 1);
            vetor1[i] = entrada.nextInt();
        }

        // Preenche o segundo vetor com dez números inteiros
        for (int i = 0; i < vetor2.length; i++) {
            System.out.printf("Digite o %dº número do segundo vetor: ", i + 1);
            vetor2[i] = entrada.nextInt();
        }

        // Intercala os dois vetores no vetor resultante
        int posicaoResultante = 0;
        for (int i = 0; i < vetor1.length; i++) {
            vetorResultante[posicaoResultante++] = vetor1[i];
            vetorResultante[posicaoResultante++] = vetor2[i];
        }

        // Mostra o vetor resultante
        System.out.println("Vetor resultante da intercalação:");
        for (int numero : vetorResultante) {
            System.out.print(numero + " ");
        }

        entrada.close();
    }
}
