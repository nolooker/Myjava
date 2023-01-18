package ch02_variable_operator;

import java.util.Scanner;

public class Ans04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;

        System.out.println("이름 입력 : ");
        String name = scan.next() ;

        System.out.println("국어 점수 입력 : ");
        int kor = scan.nextInt();

        System.out.println("영어 점수 입력 : ");
        int eng = scan.nextInt();

        System.out.println("수학 점수 입력 : ");
        int math = scan.nextInt();

        int total = kor + eng + math ;
        double average = total / 3.0;

        System.out.println("응시자 이름 : " + name);
        System.out.println("국어 : " +kor);
        System.out.println("영어 : " +eng);
        System.out.println("수학 : " +math);
        System.out.println("총점 : " +total);
        System.out.printf("평균 : %.3f\n "  , average);

        scan.close();





    }
}
