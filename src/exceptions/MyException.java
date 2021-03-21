package exceptions;

public class MyException extends Exception {
    public MyException() {
    }

    public MyException(Exception e) {
        super(e);
    }
}
