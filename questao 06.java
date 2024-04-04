import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Cria um vetor com 30 números inteiros aleatórios entre 1 e 100
        int[] vetor = new int[30];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 100) + 1;
        }

        // Pede ao usuário para digitar um valor
        System.out.print("Digite um valor: ");
        int valor = entrada.nextInt();

        // Verifica se o valor existe no vetor
        boolean valorExiste = false;
        int indiceDoValor = -1;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                valorExiste = true;
                indiceDoValor = i;
                break;
            }
        }

        // Remove o valor do vetor
        if (valorExiste) {
            for (int i = indiceDoValor; i < vetor.length - 1; i++) {
                vetor[i] = vetor[i + 1];
            }
            vetor[vetor.length - 1] = 0;
            System.out.println("O valor foi removido do vetor.");
        } else {
            System.out.println("O valor não existe no vetor.");
        }

        // Imprime o vetor
        System.out.println("Vetor:");
        for (int numero : vetor) {
            System.out.print(numero + " ");
        }
    }
}
