package ch02_variable_operator;

import java.util.Scanner;

public class Exam4_16 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;

        System.out.print( " 별 출력 갯수 입력 : " );

        int star = scan.nextInt() ;


        for (int i = 1 ; i <= star ; i++ ) {

            System.out.print("*");

            if(i%5 == 0) {

                System.out.println();

            }
        }

        System.out.println("한 줄에 몇 개 씩 출력할까요 : ");
        int oneline = scan.nextInt() ;

        for (int i = 1 ; i <= star ; i++ ) {

            System.out.print("*");

            if(i%oneline == 0) {

                System.out.println();

            }
        }


        scan.close();


    }
}
