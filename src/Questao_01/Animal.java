package Questao_01;

public class Animal {
    protected float tamanho;
    protected String cor;

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void comer() {
        System.out.println("Comeu!");
    }

}
