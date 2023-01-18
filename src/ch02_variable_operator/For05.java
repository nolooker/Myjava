package ch02_variable_operator;

public class For05 {
    public static void main(String[] args) {

        int total = 0 ;

        for ( int i = 1 ; i <= 10 ; i++) {

            if (i%3 == 0 || i%5 == 0) {

                total += i ;

            }
        }

        System.out.println("total = " +total);


    }
}
