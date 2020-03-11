package org.fundamentals.animals.example;

public abstract class Animal implements Sound, Action{
    protected abstract String getName();

    String getDescription() {
        return getName() + " " + sound() + "s and " + action();
    }
}
