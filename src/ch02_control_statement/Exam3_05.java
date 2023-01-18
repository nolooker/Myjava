package ch02_control_statement;

import java.util.Scanner;

public class Exam3_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int su = scan.nextInt();

        if (su < 0 ) {
            System.out.println("음수가 입력되었습니다.");

        }else if(su % 5 == 0) {
            System.out.println("5의 배수입니다.");

        }else{
            System.out.println("5의 배수가 아닙니다.");
        }

        scan.close();
    }
}
