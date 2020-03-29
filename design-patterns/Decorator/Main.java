package Decorator;

public class Main {
    public static void main(String[] args) {
        AMatrioshka matrioshka0 = new Matrioshka();
        AMatrioshka matrioshka1 = new ColorMatrioshka(new Matrioshka(), "синяя");
        AMatrioshka matrioshka2 = new ColorMatrioshka(new Matrioshka(), "красная");
        AMatrioshka matrioshka3 = new ColorMatrioshka(new Matrioshka(), "фиолетовая");
        AMatrioshka matrioshka4 = new SizeMatrioshka(new ColorMatrioshka(new Matrioshka(), "красная"), "большая");
        AMatrioshka matrioshka5 = new SizeMatrioshka(new ColorMatrioshka(new Matrioshka(), "зеленая"), "большая");
        System.out.println(matrioshka0.getInfo());
        System.out.println(matrioshka1.getInfo());
        System.out.println(matrioshka2.getInfo());
        System.out.println(matrioshka3.getInfo());
        System.out.println(matrioshka4.getInfo());
        System.out.println(matrioshka5.getInfo());
    }
}