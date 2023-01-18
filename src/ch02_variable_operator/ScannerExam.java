package ch02_variable_operator;

import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        //(scan) 바코드 스캐너 장비의 이름

        System.out.println("이름 입력 : ") ;
        String name = scan.next() ;

        System.out.println("나이 입력 : " ) ;
        int age = scan.nextInt() ;



        System.out.println("이름 : " +name ) ;
        System.out.println("나이 : " +age ) ;

        scan.close(); //장치 닫기

    }
}
