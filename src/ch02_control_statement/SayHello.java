package ch02_control_statement;

import java.util.Scanner;

public class SayHello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;

        System.out.print("인사말 멘트 : ");
        String hello = scan.next();

        System.out.print("반복할 횟수 : ");
        int su = scan.nextInt() ;

        for (int i = 1; i <= su ; i++) {
            System.out.println(hello);
        }

        scan.close();
    }
}
