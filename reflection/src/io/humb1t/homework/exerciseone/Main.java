package io.humb1t.homework.exerciseone;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String args) {
        Object[] classesArray = new Object[5];
        classesArray[0] = new ClassOne();
        classesArray[1] = new ClassOne();
        classesArray[2] = new ClassTwo();
        classesArray[3] = new ClassTwo();
        classesArray[4] = new ClassTwo();
        printDeprecatedClasses(classesArray);
    }

    private static void printDeprecatedClasses(Object[] arrayClasses) {
        List<Object> deprecatedClassesCollection = new LinkedList<>();
        for (Object clazz : arrayClasses) {
            if (clazz.getClass().isAnnotationPresent(Deprecated.class)) {
                deprecatedClassesCollection.add(clazz);
            }
        }
        Object[] deprecatedClasses = deprecatedClassesCollection.toArray();
        System.out.println(Arrays.toString(deprecatedClasses));
    }
}

class ClassOne {
    @Override
    public String toString() {
        return getClass() + " - not deprecated class";
    }
}

@Deprecated
class ClassTwo {
    @Override
    public String toString() {
        return getClass() + " - deprecated class" ;
    }
}
