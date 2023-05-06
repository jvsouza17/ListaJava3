package ex4;

public class Objeto {
    private String nome;
    private String marca;
    private double peso;
    
    public Objeto(String nome, String marca, double peso){
        this.nome = nome;
        this.marca = marca;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
