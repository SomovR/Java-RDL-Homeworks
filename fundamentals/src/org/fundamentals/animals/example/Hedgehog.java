package org.fundamentals.animals.example;

public class Hedgehog extends Animal implements HedgehogSound, Action {
    @Override
    public String getName() {
        return "Hedgehog";
    }
}
