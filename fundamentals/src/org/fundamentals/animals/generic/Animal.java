package org.fundamentals.animals.generic;

public class Animal<P extends Sound, T extends Action> implements ObjectsWithGroupingAndBehavior {
    private String name;
    private P sound;
    private T action;

    Animal(String name, P sound, T action) {
        this.name = name;
        this.sound = sound;
        this.action = action;
    }

    String getDescription() {
        return name + " " + sound.sound() + " and " + action.action();
    }

    @Override
    public P getGroup() {
        return sound;
    }

    @Override
    public T getBehavior() {
        return action;
    }

    @Override
    public String toString() {
        return "Animal<" + sound.getClass().getName() + "," + action.getClass().getName() + ">";
    }
}