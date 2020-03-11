package org.fundamentals.animals.example;

public interface HedgehogSound extends Sound {
    @Override
    default String sound() {
        return "frr";
    }
}
