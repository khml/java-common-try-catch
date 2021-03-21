package fuctions;

@FunctionalInterface
public interface RunnableThrowableException {
    <E extends Exception> void run() throws E;
}
