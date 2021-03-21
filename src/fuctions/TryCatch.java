package fuctions;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import exceptions.MyException;


public class TryCatch {
    public static void tryCatch(RunnableThrowableMyException func, Consumer<MyException> errorHandler) {
        try {
            func.run();
        } catch (MyException e) {
            errorHandler.accept(e);
        }
    }

    public static <R> void tryCatch(RunnableThrowableMyException func, Function<MyException, R> errorHandler) {
        try {
            func.run();
        } catch (MyException e) {
            errorHandler.apply(e);
        }
    }

    public static <T, R> void tryCatch(FunctionThrowableMyException<T, Void> func, Function<MyException, R> errorHandler) {
        try {
            func.apply(null);
        } catch (MyException e) {
            errorHandler.apply(e);
        }
    }

    public static <R> void tryCatch(List<RunnableThrowableMyException> functions, Function<MyException, R> errorHandler) {
        functions.forEach(func -> tryCatch(func, errorHandler));
    }
}
