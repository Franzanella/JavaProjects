package aula011;
public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    private float novoSalario;
    
    public void receberAumento(){
       novoSalario = salario + ((salario * 10) / 100); 
        System.out.println("O novo salario do professor é "  + this.novoSalario);
    }

    
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getNovoSalario() {
        return novoSalario;
    }

    public void setNovoSalario(float novoSalario) {
        this.novoSalario = novoSalario;
    }
    
    
    
    
}
