package ch02_control_statement;

import java.util.Scanner;

public class Exam4_18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;

        System.out.println("임의의 정수 출력 : ");
        int su = scan.nextInt() ;

        System.out.println("for 구문");
        for (int i = 1; i <= su ; i++) {
            String message = i + "의 제곱은" + (i*i) + "입니다." ;
            System.out.println(message);
        }

        System.out.println("while 구문");

        int i = 1 ;

        while(i <= su){
            String message = i + "의 제곱은" + (i*i) + "입니다." ;
            System.out.println(message);
            i++ ;
        }
    }
}
