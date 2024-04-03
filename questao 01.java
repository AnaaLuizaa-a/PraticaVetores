
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vetor = new int[10];

        // Preenche o vetor com dez números inteiros
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            vetor[i] = entrada.nextInt();
        }

        // Calcula e mostra os números primos e suas respectivas posições
        System.out.println("Números primos e suas respectivas posições:");
        for (int i = 0; i < vetor.length; i++) {
            if (éPrimo(vetor[i])) {
                System.out.printf("%d na posição %d\n", vetor[i], i + 1);
            }
        }

        entrada.close();
    }

    // Verifica se um número é primo
    public static boolean éPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    }

