package ch02_variable_operator;

import java.util.Scanner;

public class Switch08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;

        System.out.println("1~12 사이의 정수 입력 : ");
        int month = scan.nextInt() ;

        switch (month) {
            case 3 : case 4 : case 5 :
                System.out.println(month + "월은 봄입니다.");
                break;
        }
        switch (month) {
            case 6 : case 7 : case 8 :
                System.out.println(month + "월은 여름입니다.");
                break;
        }switch (month) {
            case 9 : case 10 : case 11 :
                System.out.println(month + "월은 가을입니다.");
                break;
        }switch (month) {
            case 12 : case 1 : case 2 :
                System.out.println(month + "월은 겨울입니다.");
                break;

            default:
                System.out.println(month + "은 잘못 입력하셨습니다.");


        } scan.close();
    }
}
