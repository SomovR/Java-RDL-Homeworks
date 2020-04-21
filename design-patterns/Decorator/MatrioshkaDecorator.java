package Decorator;

public class MatrioshkaDecorator extends AMatrioshka {
    AMatrioshka matrioshka;

    public MatrioshkaDecorator(AMatrioshka matrioshka) {
        this.matrioshka = matrioshka;
    }

    public String getInfo() {
        return matrioshka.getInfo();
    }
}
