package ch02_variable_operator;

import java.util.Scanner;

public class SumOneToN02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;

        System.out.println("임의의 정수 입력 : ");
        int su = scan.nextInt() ;

        int total = 0 ;

        for (int i = 1 ; i <= su ; i += 10 ) {


            total += i * i ;


        }

        System.out.println("이 변수값의 정답은 : " + total);

        scan.close();

    }
}
