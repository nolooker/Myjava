package ch02_control_statement;

public class For06 {
    public static void main(String[] args) {
        double total = 0 ;

        for (int i = 1; i < 101 ; i++) {
            total += (double)1/i ;
        }
        System.out.println("총합 = " + total);

        total = 0.0 ;

        for (int i = 1; i < 101; i++) {
            total += (double)(i-1)/i ;
        }
        System.out.println("총합02 : " + total);
    }
}
