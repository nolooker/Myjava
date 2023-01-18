package ch02_variable_operator;

public class DoubleFor2 {
    public static void main(String[] args) {
        int total = 0 ;


        for (int i = 1; i < 3 ; i++) {
            for (int j = 5 ; j < 8 ; j++) {

                total += i + j ;

            }
        }
        System.out.println("총합 : " +total);
    }
}
