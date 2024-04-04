

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

      //solicitar temperatura
      int temp []= new int [8];
      int i;
      for (i=0; i<8; i++){
        System.out.println("Digite temperatura: ");
        temp[i]=entrada.nextInt();
      }
         
      // imprimir maior temperatura registrada
      int Maiortemp=0;
      for (i=0; i<8; i++){
        if (temp[i]>Maiortemp){
          Maiortemp=temp[i];
        }
      }
      System.out.print("A maior temperatura é: "+Maiortemp);
      }
      }

    
