package Decorator;

public class SizeMatrioshka extends MatrioshkaDecorator {
    private String size;

    public SizeMatrioshka(AMatrioshka matrioshka, String size) {
        super(matrioshka);
        this.size = size;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " " + this.size;
    }
}
