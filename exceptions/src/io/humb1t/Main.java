package io.humb1t;

import java.nio.file.AccessDeniedException;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        try {
            new LifeCycleAction().execute();
        } catch (LifeCycleActionExecutionException | AccessDeniedException | TaskOneException e) {
            System.err.println(e.getLocalizedMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
//        try (FileInputStream fileInputStream = new FileInputStream(args[0])) {
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try (TaskTwoCloseable resource = new TaskTwoCloseable()){
            resource.printer();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static class LifeCycleAction {
        public void execute() throws LifeCycleActionExecutionException, AccessDeniedException, TaskOneException {
            throw new TaskOneException("Here is an exception!");
            //throw new LifeCycleActionExecutionException();
        }
    }

    public static class LifeCycleActionExecutionException extends Exception {
    }


    public void exceptionVsResult() {
        final String result1 = (String) this.returnResult().value;
        final String result2 = returnOptional().orElse("");
        String result3 = "";
        try {
            result3 = returnValueOrThrowException();
        } catch (AccessDeniedException e) {
        }
    }

    private Result returnResult() {
        return Result.OK.setValue("OK");
    }

    private Optional<String> returnOptional() {
        return Optional.of("OK");
    }

    private String returnValueOrThrowException() throws AccessDeniedException {
        return "OK";
    }
}
