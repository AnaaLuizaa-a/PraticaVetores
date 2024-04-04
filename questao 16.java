

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

      //solicitar um número
      int resposta []= new int [5];
      int i;
      for (i=0; i<5; i++){
        System.out.println("Digite um número: ");
        resposta[i]=entrada.nextInt();
      }
         
      // imprimir resposta no numero inverso
      for (i=4; i>=0; i--){
        System.out.println(resposta[i]);
      }
      
      }
      }

    
