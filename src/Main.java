import java.util.function.Consumer;

import exceptions.MyException;
import fuctions.TryCatch;


public class Main {
    public static void main(String[] args) {
        // エラーを処理する関数。今回はExceptionを表示するだけ
        Consumer<MyException> errorHandler = (e) -> System.out.println(e.getMessage());

        TryCatch.tryCatch(Main::doSomething1, errorHandler);
        TryCatch.tryCatch(Main::doSomething2, errorHandler);
    }

    public static void doSomething1() throws MyException {
        // 処理1
        throw new MyException();
    }

    public static void doSomething2() throws MyException {
        // 処理2
        throw new MyException();
    }
}
