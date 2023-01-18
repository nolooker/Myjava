package ch02_control_statement;

import java.util.Scanner;

public class Gugudan02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        System.out.print("시작 단수 입력 : ");
        int begin = scan.nextInt() ; // 3

        if(begin < 0){
            begin = Math.abs(begin) ;
        }

        System.out.print("끝 단수 입력 : ");
        int end = scan.nextInt() ; // 5

        if(end < 0){
            end = Math.abs(end) ;
        }

        // swap 기법) 2개의 변수 값을 서로 맞바꾸는 알고리즘
        int imsi ;

        if(begin > end){
            imsi = begin ;
            begin = end ;
            end = imsi ;
        }

        for (int i = begin; i <= end ; i++) {
            for (int j = 1; j < 10 ; j++) {

                String temp = "%d * %d = %2d\t" ;
                System.out.printf(temp, i, j, (i*j));
            }
            System.out.println();
        }
        scan.close();
    }
}
