/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webinarlogicadio;

import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class WebinarLogicaDIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     /* float salario, fgts, salLiq;
        fgts =0.08f;
      
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreva o seu salario: ");
        salario =  teclado.nextInt();
        salLiq = salario -(salario*fgts);
        System.out.println("Salario Liq: " + salLiq);
*/
     
     float salario, descFGTS, descIRF;
     descFGTS = 0.08f;
     descIRF = 0.0f;
     
    Scanner teclado = new Scanner(System.in);
      
      
    System.out.println("Digite o seu salário: ");
    salario = teclado.nextInt();
   
        
        if (salario<1903.99) {
            descIRF = 0.0f;
        } else if (salario>1903.99 && salario<2826.66) {
            descIRF = 142.80f;
        } else if (salario>2826.66 && salario < 3751.05){
            descIRF = 354.80f;
        } else if(salario>3751.05 && salario<4664.68){
            descIRF= 636.13f;
            
        }else if(salario>4664.68){
            descIRF = 869.36f;     
        } else{
            System.out.println("Não encontrado");
        }
     
    System.out.println("FGTS com desconto de 8% : " + salario*descFGTS);
    System.out.println("Parcela a reduzir do IRF: " + descIRF);
    System.out.println("Salario Líquido: " + (salario-(salario*descFGTS) - descIRF));
        
    }
    
}
