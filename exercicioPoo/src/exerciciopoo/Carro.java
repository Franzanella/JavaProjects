package exerciciopoo;
public class Carro {
    //atributos
    public String modelo;
    public String cor;
    public int ano;
    public int portas;
    public boolean chave;
    
    
    public Carro(String m, String c, int a, int p){
         this.modelo = m;
         this.cor = c;
         this.ano = a;
         this.portas = p;
         
         
     }
    
    //metodos
   public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ano: " + this.ano);
        System.out.println("Portas: " + this.portas);
        System.out.println("Ta ligado? " + this.chave);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public void ligado(){
        if  (this.chave == true){
            System.out.println("O carro esta ligado");
        }
         
        
    }
     
     
     public void desligado(){
        if  (this.chave == false){
            System.out.println("O carro esta desligado");
        }
     }
    }
    
 
    

