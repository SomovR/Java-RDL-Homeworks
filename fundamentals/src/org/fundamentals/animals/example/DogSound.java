package org.fundamentals.animals.example;

public interface DogSound extends Sound {
    @Override
    default String sound() {
        return "bark";
    }
}
