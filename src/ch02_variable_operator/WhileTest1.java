package ch02_variable_operator;

import java.util.Scanner;

public class WhileTest1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;

        System.out.println("몇단으로 출력 : ");

        int dan = scan.nextInt() ;

        int i = 1 ;
        while (i < 10) {

            String temp = dan + "*" + i + "=" + (dan * i);

            System.out.println(temp);
            i++;
        }


        scan.close();

    }
}
