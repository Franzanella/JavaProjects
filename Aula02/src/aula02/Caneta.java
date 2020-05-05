package aula02;
public class Caneta {
    //5 atributos
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    //4 metodos
    void status(){
        System.out.println(" Modelo: " + this.modelo);
        System.out.println(" Cor: " + this.cor);
        System.out.println(" Ponta: " + this.ponta);
        System.out.println(" Carga: " + this.carga);
        System.out.println(" está tampada? " + this.tampada);
        
    }
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
}
