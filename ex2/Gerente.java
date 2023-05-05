package ex2;

public class Gerente extends Empregado {
    private String nomeGerencia;
    
    public Gerente(String nome, int idade, String sexo, double salario, String matricula, String nomeGerencia) {
        super(nome, idade, sexo, salario, matricula);
        this.nomeGerencia = nomeGerencia;
    }
    
    public String getNomeGerencia() {
        return nomeGerencia;
    }
    
    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }
    
    @Override
    public String toString() {
        double inss = getSalario() * 0.11;
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nMatrícula: " + getMatricula() + "\nNome da Gerência: " + nomeGerencia + "\nValor do INSS: " + inss;
    }
}