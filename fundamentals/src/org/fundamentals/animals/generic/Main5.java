package org.fundamentals.animals.generic;

public class Main5 {
    public static void main(String[] args) {
        Animal animal = getLanguageByName(args[0]);
        System.out.println(animal.getDescription());
        System.out.println(animal.toString());
    }

    private static Animal getLanguageByName(String name) {
        switch (name.toLowerCase()) {
            case "dog":
                return new Animal("dog", () -> "barks", () -> "can protect house");
            case "cat":
                return new Animal("cat", () -> "meows", () -> "can catch mices");
            case "hedgehog":
                return new Animal("hedgehog", () -> "frrs", () -> "can catch mices");
            default:
                return new Animal(name, new UnknownAnimal(), new UnknownAnimal());
        }
    }
}
