package ch11_lamdba_expression.functionalInterface;

import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierMain {
    public static void main(String[] args) {
        final String mystring = "hello~~world" ;

        Supplier<String> supplier01 = () -> {return mystring;} ;
        System.out.println(supplier01.get());

        IntSupplier supplier02 =() -> {
            return new Random().nextInt(6) + 1 ;
        };

        for (int i = 1; i <= 10; i++) {
            String message = "%2d번째 시도 : %d\n" ;
            System.out.printf(message, i, supplier02.getAsInt());
        }

        IntSupplier supplier03 =() -> {
            return mystring.length() ;
        };
        System.out.println(mystring + "의 길이 : " + supplier03.getAsInt());
    }
}
