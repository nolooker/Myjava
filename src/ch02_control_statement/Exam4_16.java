package ch02_control_statement;

import java.util.Scanner;

public class Exam4_16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;

        System.out.println("별 출력 개수 입력 : ");
        int star = scan.nextInt() ;

        for (int i = 1; i <= star ; i++) {
            System.out.print("*");
            if(i%5 ==0){
                System.out.println();
            }
        }

        System.out.println("한줄에 몇개씩 출력 할까요 : ");
        int oneline = scan.nextInt() ;

        for (int i = 1; i <= star ; i++) {
            System.out.print("*");
            if(i%oneline ==0){
                System.out.println();
            }
        }

        scan.close();
    }
}
