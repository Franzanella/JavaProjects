package vetor;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
      /* int n[] = {3,5,8,2,1,5};
        //System.out.println("Total de casas de N " + n.length);
       for(int c=0; c<=n.length-1; c++){
           System.out.println("Na posicao " + c + " temos o valor " + n[c]);
       }*/
        
      /*VETOR MESES DO ANO
      int resposta = 0;
      int ano;
      String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
      int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
       if (resposta % 4 == 0 || resposta % 400 == 0) {
   tot[1] = 29;
  }
  for (int cont = 0; cont < tot.length; cont++) {
   System.out.println("O mês de " + mes[cont] + " tem " + tot[cont] + " DIAS");
  }
  
         Scanner ent = new Scanner(System.in);
      
         System.out.println("Digite um ano para saber se é bissexto");
         ano = ent.nextInt();
      
      if(ano % 400 == 0){
            System.out.println(ano + " é bissexto.");
        // se o ano for menor que 400
        } else if((ano % 4 == 0) && (ano % 100 != 0)){
            System.out.println(ano + " é bissexto.");
        } else{
            System.out.println(ano + " não é bissexto");
        }
      
      */
      /*
       double v[] = {3.5, 2.75, 9, -4.5};
       Arrays.sort(v);
       for (double valor: v){
            System.out.println(valor + " ");
    }
    
   */
      
      /*
      int vet[] = {3,7,6,1,9,4,2};
      for(int v:vet){
          System.out.println(v);
      }
      int p = Arrays.binarySearch(vet, 4);
        System.out.println("Encontrei o valor na posição " + p);
*/
      
      int v[] = new int[20];
      Arrays.fill(v, 0);
      for(int valor: v){
          System.out.print( valor + " ");
          
      }
}
}
