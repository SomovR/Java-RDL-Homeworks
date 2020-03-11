package org.fundamentals.animals.example;

public class UnknownAnimal extends Animal {
    private String name;

    UnknownAnimal(String name) {
        this.name = name;
    }

    @Override
    protected String getName() {
        return name;
    }

    @Override
    public String sound() {
        return "unknown";
    }

    @Override
    public String action() {
        return "unclear";
    }
}
