package ch02_variable_operator;

import java.util.Scanner;

public class V2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1번째 정수 입력 : ");
        int first = scan.nextInt();

        System.out.println("2번째 정수 입력 : ");
        int second = scan.nextInt();

        int total = 0;

        for (int i = first; i <= second; i++) {
            if (i % 3 != 0) {
                total += i;
            }
        }
        System.out.println("답 : " + total);
    }
}
