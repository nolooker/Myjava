package ch02_variable_operator;

import java.util.Scanner;

public class Exam4_01_18 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;

        System.out.println(" 임의의 정수 입력 : ");

        int su = scan.nextInt() ;

        for (int i = 1 ; i <= su ; i++ ) {

            System.out.println(i + " 의 제곱은 " + (i * i) + " 입니다. ");

        }
                scan.close();


    }
}
