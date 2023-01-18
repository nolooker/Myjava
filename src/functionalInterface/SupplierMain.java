package functionalInterface;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierMain {
    public static void main(String[] args) {
        final String mystring = "hello~~World";

        Supplier<String> supplier01 = () -> {return mystring;};
        System.out.println(supplier01.get());

        IntSupplier supplier02 = () -> {
            int num = (int)(6.0 * Math.random() + 1.0);
            return num;
        };

        for (int i = 0; i < 10 ; i++) {
            String message = (i+1) + "번째 시도 : " + supplier02.getAsInt();
            System.out.println(message);
        }

    }
}
