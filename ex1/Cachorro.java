package ex1;

public class Cachorro extends Animal {
    private String raca;
    
    public Cachorro(String nome, double peso, String raca) {
        super(nome, peso);
        this.raca = raca;
    }
    
    public String getRaca() {
        return raca;
    }
    
    public void setRaca(String tipoHabitat) {
        this.raca = tipoHabitat;
    }
    @Override
     public String toString() {
        return "\nNome: " + nome + "\nPeso: " + peso + "\nTipo de habitat: " + raca;
    }
}