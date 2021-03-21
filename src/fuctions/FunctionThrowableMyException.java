package fuctions;

import exceptions.MyException;

@FunctionalInterface
public interface FunctionThrowableMyException<T, R> {
    R apply(T t) throws MyException;
}
