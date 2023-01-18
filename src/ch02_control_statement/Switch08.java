package ch02_control_statement;

import java.util.Scanner;

public class Switch08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;

        System.out.print("1~12 사이의 정수 입력 : ");
        int month = scan.nextInt() ;

        // switch 구문
        switch (month){
            case 3 : case 4 : case 5 :
                System.out.println(month + "는 봄");
                break ;
            case 6 : case 7 : case 8 :
                System.out.println(month + "는 여름");
                break ;
            case 9 : case 10 : case 11 :
                System.out.println(month + "는 가을");
                break ;
            case 12 : case 1 : case 2 :
                System.out.println(month + "는 겨울");
                break ;
            default:

        }

        scan.close();
    }
}