package io.humb1t.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ExerciseFour {
    public static void main(String[] args) {
        Integer[] integers = new Integer[20];
        Random r = new Random();

        for (int i = 0; i < integers.length; i++) {
            integers[i] = r.nextInt(5);
        }

        Collection<Integer> collection = new ArrayList<>(Arrays.asList(integers));
        //collection.stream().forEach(System.out::println);
        Set<Integer> set = new HashSet<>(collection);
        //set.stream().forEach(System.out::println);
    }
}