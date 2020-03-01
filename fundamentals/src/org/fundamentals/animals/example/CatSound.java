package org.fundamentals.animals.example;

public interface CatSound extends Sound{
    @Override
    default String sound() {
        return "meow";
    }
}
