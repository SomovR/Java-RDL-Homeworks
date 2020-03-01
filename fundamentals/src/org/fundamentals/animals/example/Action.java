package org.fundamentals.animals.example;

public interface Action {
    default String action() {
        return "can catch mice";
    }
}
