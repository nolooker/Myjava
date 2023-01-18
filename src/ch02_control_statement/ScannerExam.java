package ch02_control_statement;

import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        // scan) 바코드 스캐너 장비의 이름
        Scanner scan = new Scanner(System.in);

        System.out.println("이름 입력해 주세요 : ");
        String name = scan.next() ;

        System.out.println("나이 입력 해주세요 : ");
        int age = scan.nextInt() ;

        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);

        scan.close(); // 장치 닫기
    }
}
