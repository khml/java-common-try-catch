package fuctions;

import exceptions.MyException;

@FunctionalInterface
public interface RunnableThrowableMyException {
    void run() throws MyException;
}
