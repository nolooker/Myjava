package ch02_variable_operator;

import java.util.Scanner;

public class SumOneToN {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;

        System.out.println("임의의 정수 입력 : ");
        int su = scan.nextInt() ;

        int total = 0 ;

        for (int i = 1 ; i <= su ; i++ )
        { total += i ; }

        System.out.println(" 1부터 " + su + " 까지의 합은 " +total + " 이다. ");

        scan.close();

    }
}
