import java.util.Scanner;
public class Main {
  // Função para verificar vetor modificavel
  public static boolean VerificaArray(int posicao, boolean array[]){

   return array[posicao];

  }

  public static void main(String[] args) {
    // declarar variaveis
     Scanner sc = new Scanner(System.in);
    int[] array = new int[5];
    boolean[] modificavel = new boolean[5];
    int alteracao = 0;
    int posicao = 0;
    int novovalor = 0;
    // inicializar variaveis
    for (int i = 0; i < array.length; i++){
      array[i] = i;
      modificavel[i] = true;  
    }
    // controlar a alteracao do array
    while (alteracao == 0){
      System.out.println("Informe a Posicao a ser alterada: ");
       posicao = sc.nextInt();
      System.out.println("Informe o valor a ser alterado: ");
      novovalor = sc.nextInt();
      if(VerificaArray(posicao, modificavel) == true){
        array[posicao] = novovalor;
        modificavel[posicao] = false;
      }else{
       System.out.println("Não Posso alterar o Array");
      }

      for (int i = 0; i < array.length; i++){
        System.out.println(array[i]);
        System.out.println(modificavel[i]);
      }

      System.out.println("Deseja continuar? 0 - sim, 1 - nao");
      alteracao = sc.nextInt();


    }


  }


}