package io.humb1t;

public class TaskTwoCloseable implements AutoCloseable{
    @Override
    public void close() throws TaskOneException {
        System.out.println("Resource is closed");
    }

    void printer() {
        System.out.println("Some text to check method printer()");
    }
}
