package ch03_array;

import java.util.Scanner;

public class Gugudan02 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in) ;

        System.out.println("시작 단수 입력 : ");
        int begin =scan.nextInt() ;

        if (begin < 0) {
            begin = Math.abs(begin) ;
        }

        System.out.println("끝 단수 입력 : ");
        int end =scan.nextInt() ;

        if (end < 0) {
            end = Math.abs(end) ;
        }

        int insi ;
        if (begin > end ) {
            insi = begin  ;
            begin = end ;
            end = insi ;

        }

        for (int i = begin ; i < end ; i++) { //행


            for (int j = 1; j < 10 ; j++) { //열


                String temp = i +"*" + j + "=" + (i*j) ;
                System.out.print(temp + "\t");

            }

            System.out.println();
        }
    }
}
