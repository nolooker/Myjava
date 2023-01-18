package ch02_variable_operator;

import java.util.Scanner;

public class if01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;

        System.out.println("정수 1개 입력 : ");
        int su = scan.nextInt() ;

        if (su%2 == 0 ) {
            System.out.println(su + "는 짝수 입니다.");
        }

        System.out.println("이 문장은 무조건 출력됩니다.");

        scan.close();
    }
}
