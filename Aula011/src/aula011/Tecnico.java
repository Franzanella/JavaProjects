package aula011;
public class Tecnico extends Aluno {
    public void registroProfissional(){
        System.out.println("Registrando...  " + this.nome);
    }
    
    public void praticar(){
        System.out.println("Praticando " + this.nome);
    }
}
