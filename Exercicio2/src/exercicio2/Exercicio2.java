
package exercicio2;

public class Exercicio2 {

   
    public static void main(String[] args) {
       Pessoa [] p = new Pessoa[2];
       Livro [] l = new Livro[3];
       
       p[0] = new Pessoa("Bruno", 30, "M");
       p[1] = new Pessoa ("Fran", 28, "F");
       l[0] = new Livro ("Aprendendo Java", "Jose", 300, p[0]);
       l[1] = new Livro ("Aprendendo Ruby", "Joao", 10, p[1]);
       l[2] = new Livro ("Aprendendo JavaScript", "Jessica", 200, p[0]);
              
        System.out.println(l[0].detalhes());
       
    }
    
}
