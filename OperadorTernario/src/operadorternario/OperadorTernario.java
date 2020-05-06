/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author Fran
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int n1,n2,r;
        
        n1 = 14;
        n2 = 8;
        r = (n1>n2)?n1+n2:n1-n2;
        System.out.println(r);*/
        
        /*
        //COMPARAÇÃO STRING
        String nome1 = "Gustavo";
        String nome2 = "Fran";
        String nome3 = new String("Gustavo");
        String res;
        res = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);*/
        
        //OPERADORES LOGICOS
        
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        r = (x<y ^ y<z)?true:false;
        System.out.println(r);
    }
    
}
