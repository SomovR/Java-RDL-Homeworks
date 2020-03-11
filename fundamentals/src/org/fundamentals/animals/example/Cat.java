package org.fundamentals.animals.example;

public class Cat extends Animal implements CatSound, Action {
    @Override
    public String getName() {
        return "Cat";
    }
}
