package ch02_variable_operator;

import java.util.Scanner;

public class SumTest02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;

        int total = 0 ;

        System.out.println("첫 번째 정수 : ");
        int first = scan.nextInt() ;

        System.out.println("두 번째 정수 : ");
        int second = scan.nextInt() ;

        for ( int i = first ; i <= second ; i++ ) {

            if ( i % 3 != 0 ) {

                total += i ;


            }

        }

        System.out.println("총합 : " + total);

    }
}
