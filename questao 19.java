
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

      // Vetor com os códigos de produtos disponíveis
      String[] produtosDisponiveis = {"P123", "P456", "P789", "P1011", "P1213" , "P127"};

      // Solicita ao usuário o código do produto
      System.out.print("Digite o código do produto: ");
      String codigoProduto = entrada.nextLine();

      // Verifica se o código do produto está presente no vetor
      boolean produtoEncontrado = false;
      for (String produto : produtosDisponiveis) {
          if (produto.equals(codigoProduto)){
              produtoEncontrado = true;
              break;
          }
      }
      // Exibe a mensagem correspondente
      if (produtoEncontrado) {
          System.out.println("Produto encontrado!");
      } else {
          System.out.println("Produto não encontrado!");
      }
      }
    }


    
