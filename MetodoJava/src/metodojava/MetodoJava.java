package metodojava;
public class MetodoJava {
   
    //PROCEDURE JAVA
    /*
    static void soma(int a, int b){
        int s = a + b;
        System.out.println(" A soma é " + s);
    }
    
    
    
    public static void main(String[] args) {
        soma(5,2);
    }
    */
    
    //FUNCTION JAVA
     static int soma(int a, int b){
        int s = a + b;
        return s;
    }
    
     public static void main(String[] args) {
         int sm = soma(5,2);
         System.out.println("A soma vale " + sm);
    }
}
