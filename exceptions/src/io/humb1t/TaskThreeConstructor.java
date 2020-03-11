package io.humb1t;

public class TaskThreeConstructor {
    private int someField;
    TaskThreeConstructor(int someField) throws TaskOneException {
        if (someField == 0) {
            throw new TaskOneException("Поле не может быть равно 0!");
        } else {
            this.someField = someField;
        }

    }

    public static void main(String[] args)  {
        TaskThreeConstructor ttc;
        try {
            ttc = new TaskThreeConstructor(0);
            /*I suppose variable has no value because this is a local variable
            that needs to be initialized manually */
        } catch (TaskOneException e) {
            e.printStackTrace();
        }
    }
}


