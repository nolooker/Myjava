package ch02_variable_operator;

import java.util.Scanner;

public class Logical01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;

        System.out.println("1~12 사이의 정수 입력 : ");

        int month = scan.nextInt() ;

        String season ;

        if (month >= 3 && month <=5 ){
            season = "Spring" ;
        } else if (month >= 6 && month <= 8) {
            season = " Summer " ;
        } else  if ( month >= 9 && month <= 11) {
            season = " fall " ;
        } else {
            season = " Winter " ;
        }

        String message = "%d월은 %s 입니다." ;
        System.out.printf(message, month, season);


      scan.close();
    }
}
