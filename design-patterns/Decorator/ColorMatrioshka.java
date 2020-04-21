package Decorator;

public class ColorMatrioshka extends MatrioshkaDecorator {
    private String color;

    public ColorMatrioshka(AMatrioshka matrioshka, String color) {
        super(matrioshka);
        this.color = color;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " " + this.color;
    }
}
