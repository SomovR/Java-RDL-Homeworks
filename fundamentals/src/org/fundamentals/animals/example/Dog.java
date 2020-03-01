package org.fundamentals.animals.example;

public class Dog extends Animal implements DogSound, DogAction{
    @Override
    public String getName() {
        return "Dog";
    }
}
