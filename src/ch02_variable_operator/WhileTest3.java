package ch02_variable_operator;

import java.util.Scanner;

public class WhileTest3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;


        // Math : 수학 공식과 관련된 클래스

//        int su = -12 ;
//        su = Math.abs(su) ;
//        System.out.println(su);

        System.out.print("정수 값 1개 설정 : ");
        int su = scan.nextInt() ;

        //여기에 코딩

        if (su < 0) { //음수 일 때, 절댓값으로 변경
            su = Math.abs(su);
        }

        int factorial = 1 ; //초기식

        while ( su>1 ){

            factorial *= su ;
            su--;
        }
        //여기에 코딩


        System.out.println("팩토리얼" + factorial);

        scan.close();
    }
}
