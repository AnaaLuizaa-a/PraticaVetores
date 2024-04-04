
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

      //solicitar numero
      double numero[]= new double [2];
      int i;
      for (i=0; i<2; i++){
        System.out.println("Digite o numero a ser somado: ");
        numero[i]=entrada.nextDouble(); }
      //soma
      double soma=0;
          soma=soma+numero[0]+numero[1];
      i++;
      System.out.print("A soma dos dois número é: "+soma);
      }
    }


    
