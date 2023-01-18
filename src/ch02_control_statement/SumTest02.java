package ch02_control_statement;

import java.util.Scanner;

public class SumTest02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;

        System.out.print("1번째 정수 입력 : ");
        int first = scan.nextInt() ;

        System.out.print("2번째 정수 입력 : ");
        int second = scan.nextInt() ;

        int total = 0 ;

        for (int i = first; i <= second ; i++) {
            if(i%3 != 0){
                total += i ;
            }
        }
        System.out.print("총합 : " + total);
        scan.close();
    }
}
