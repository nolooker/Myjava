package ch02_control_statement;

import java.util.Scanner;

public class WhileTest3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;

        // Math : 수학 공식과 관련된 클래스
//        int su = -12 ;
//        su = Math.abs(su);
//        System.out.println(su);

        System.out.print("정수 1개 입력 : ");
        int su = scan.nextInt() ;

        if(su < 0){ // 음수일 때, 절대값으로 변경
            su = Math.abs(su) ;
        }

        int factorial = 1 ; // 초기식

        while(su > 1){
            factorial *= su ;
            su-- ;
        }

        System.out.println("팩토리얼 : " + factorial);

        scan.close();
    }
}
