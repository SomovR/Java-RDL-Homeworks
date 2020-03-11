package org.fundamentals.animals.example;

public class Main4 {
    public static void main(String[] args) {
        printLanguageDescription(getLanguageByName(args[0]));
    }

    private static Animal getLanguageByName(String name) {
        switch (name.toLowerCase()) {
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
            case "hedgehog":
                return new Hedgehog();
            default:
                return new UnknownAnimal(name);
        }
    }

    private static void printLanguageDescription(Animal animal) {
        System.out.println(animal.getDescription());
    }
}
