package io.humb1t.homework;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExerciseFive {
    private static Set<Integer> hashSet = new HashSet<>();
    private static Set<Integer> treeSet = new TreeSet<>();
    private static int amount = 10_000_000;

    public static void main(String[] args) {
        System.out.println(String.format("Время добавления " + amount +  " элементов в HashSet: " +  "%.3f" + " миллисекунд", getAddTime(hashSet)));
        System.out.println(String.format("Время добавления " + amount +  " элементов в TreeSet: " +  "%.3f" + " миллисекунд", getAddTime(treeSet)));
        System.out.println(String.format("Время поиска элемента в HashSet: " + "%.3f" + " миллисекунд", getSearchTime(hashSet)));
        System.out.println(String.format("Время поиска элемента в TreeSet: " + "%.3f" + " миллисекунд", getSearchTime(treeSet)));
        System.out.println(String.format("Время удаления " + amount +  " элементов в HashSet: " +  "%.3f" + " миллисекунд", getRemoveTime(hashSet)));
        System.out.println(String.format("Время удаления " + amount +  " элементов в TreeSet: " +  "%.3f" + " миллисекунд", getRemoveTime(treeSet)));
    }

    private static void add(Set<Integer> set, int amount) {
        for (int i = 0; i < amount; i++) {
            set.add(i);
        }
    }

    private static void search(Set<Integer> set) {
        boolean isFound;
        for (int i = 0; i < set.size(); i++) {
            int number = 500;
            isFound = set.contains(number);
            if (isFound) {
                break;
            }
        }
    }

    private static void remove(Set<Integer> set) {
        for (int i = 0; i < set.size(); i++) {
            set.remove(i);
        }
    }

    private static double getAddTime(Set<Integer> set) {
        long startTime= System.nanoTime();
        add(set, amount);
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1_000_000.0;
    }

    private static double getSearchTime(Set<Integer> set) {
        long startTime= System.nanoTime();
        search(set);
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1_000_000.0;
    }

    private static double getRemoveTime(Set<Integer> set) {
        long startTime = System.nanoTime();
        remove(set);
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1_000_000.0;
    }
}
