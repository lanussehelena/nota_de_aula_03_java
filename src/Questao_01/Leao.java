package Questao_01;

public class Leao extends Animal {
    private boolean juba;

    public boolean isJuba() {
        return juba;
    }

    public void setJuba(boolean juba) {
        this.juba = juba;
    }

    public void cacar() {
        System.out.println("O leão é um caçador nato");
    }
}
