package ch02_variable_operator;

import java.util.Scanner;

public class Exam3_05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("숫자입력 : ");
        int su = scan.nextInt();

        if (su < 0) {

            System.out.println("음수가 입력 되었습니다.");

        } else if (su % 5 == 0) {

            System.out.println("5의 배수 입니다.");

        } else {

            System.out.println("5의 배수가 아닙니다.");

        }

        scan.close();
    }
}
