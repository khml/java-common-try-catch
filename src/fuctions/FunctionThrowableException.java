package fuctions;

@FunctionalInterface
public interface FunctionThrowableException<T, R, E extends Exception> {
    R apply(T t) throws E;
}
