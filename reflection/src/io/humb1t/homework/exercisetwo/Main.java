package io.humb1t.homework.exercisetwo;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Object[] classesArray = new Object[9];
        classesArray[0] = new ParentOne();
        classesArray[1] = new ParentOneChildOne();
        classesArray[2] = new ParentOneChildTwo();
        classesArray[3] = new ParentTwo();
        classesArray[4] = new ParentTwoChildOne();
        classesArray[5] = new ParentTwoChildTwo();
        classesArray[6] = new ParentThree();
        classesArray[7] = new ParentThreeChildOne();
        classesArray[8] = new ParentThreeChildTwo();
        printNotDeprecatedSubclassesForParentClass(classesArray);
    }

    public static void printNotDeprecatedSubclassesForParentClass(Object[] arrayClasses) {
        List<Object> finalClassesCollection = new LinkedList<>();
        List<Object> notDeprecatedClassesCollection = new LinkedList<>();
        Class parentClass;
        for (Object anyClass : arrayClasses) {
            if (!anyClass.getClass().isAnnotationPresent(Deprecated.class)) {
                notDeprecatedClassesCollection.add(anyClass);
            }
            parentClass = anyClass.getClass().getSuperclass();
            for (Object clazz : notDeprecatedClassesCollection) {
                if (parentClass.isAssignableFrom(clazz.getClass())
                        && !clazz.getClass().equals(parentClass)
                        && !clazz.getClass().getSuperclass().equals(Object.class)) {
                    if (!finalClassesCollection.contains(clazz)) {
                        finalClassesCollection.add(clazz);
                    }
                }
            }
        }
        finalClassesCollection.forEach(x -> System.out.println(x.getClass().getSimpleName()));
    }
}
