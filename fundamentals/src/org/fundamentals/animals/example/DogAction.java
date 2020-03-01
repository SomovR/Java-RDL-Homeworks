package org.fundamentals.animals.example;

public interface DogAction extends Action{
    @Override
    default String action() {
        return "can protect house";
    }
}
