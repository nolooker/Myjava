package ch02_variable_operator;

import java.util.Scanner;

public class WhileTest01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;

        System.out.println("몇단으로 출력 : ");

        int dan = scan.nextInt() ;


        for (int i = 1 ; i < 10 ; i++) {

            String temp = dan + "*" + i + "=" + (dan * i);


            System.out.println(temp);


        }


        scan.close();

    }
}
