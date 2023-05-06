package ex4;

import static java.lang.Boolean.TRUE;

public class Caneta extends Objeto{
    private String corTinta;
    private boolean temTinta = TRUE;
    
    public Caneta(String nome, String marca, double peso, String corTinta, boolean temTinta) {
        super(nome, marca, peso);
        this.corTinta = corTinta;
        this.temTinta = temTinta;
    }
    
    public boolean isTemTinta() {
        return temTinta;
    }
    
    public void setTemTinta(boolean temTinta) {
        this.temTinta = temTinta;
    }

    public String getCorTinta() {
        return corTinta;
    }
    
    public void setCorTinta(String corTinta) {
        this.corTinta = corTinta;
    }
    
    @Override
    public String toString() {
        return "\nNome: " + getNome() + "\nMarca: " + getMarca() + "\nPeso em gramas: " + getPeso() + "\nCor da tinta: " + corTinta + "\nAinda tem tinta? " +temTinta;
    }
 
}
