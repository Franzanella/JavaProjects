/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicao;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class Condicao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // CONDIÇÃO SIMPLES
        /* Scanner teclado = new Scanner(System.in);
         System.out.print("Digite a primeira nota ");
    
        float n1 = teclado.nextFloat();
        System.out.print("Digite a segunda nota  ");
        
        float n2 = teclado.nextFloat();
        float m = (n1 + n2)/2;
        System.out.println("Sua media foi " + m);
        if (m>9){
            System.out.println("Parabéns!");
        } else {
            System.out.println("Reprovado");
        }
    */
    
    /*CONDIÇÃO COMPOSTA
    
    Scanner teclado = new Scanner(System.in);
         System.out.print("Digite seu ano de nascimento ");
    
        int ano = teclado.nextInt();
        int i = (2020 - ano);
        System.out.println("Sua idade é " + i);
       
        if (i >= 18){
            System.out.println("Maior de idade!");
        } else {
            System.out.println("Menor de idade");
        }
    */
    
    // CONDIÇÃO COMPOSTA ENCADEADA
     Scanner teclado = new Scanner(System.in);
     System.out.print("Digite seu ano de nascimento ");
    
        int ano = teclado.nextInt();
        int i = (2020 - ano);
        System.out.println("Sua idade é " + i);
    
        if (i < 16){
            System.out.println("Não vota!");
        } else if(i>=16 && i<18 || (i>70)) {
            System.out.println("Opcional");
        } else{
            System.out.println("Obrigatorio");
        }
        
    } 
}
