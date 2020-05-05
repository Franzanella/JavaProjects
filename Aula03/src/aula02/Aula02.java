package aula02;
public class Aula02 {
    public static void main(String[] args) {
        //Instanciar
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Verde";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = false;
        c1.destampar();
        c1.status();
        c1.rabiscar();
        
    }
    
}
