package org.fundamentals.animals.generic;

public class UnknownAnimal implements Sound, Action{
    @Override
    public String sound() {
        return "unknown";
    }

    @Override
    public String action() {
        return "unclear";
    }
}
