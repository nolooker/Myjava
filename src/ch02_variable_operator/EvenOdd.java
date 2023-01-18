package ch02_variable_operator;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("배열 요소 갯수 입력 : ");

        int size = scan.nextInt(); // 3

        int[] jumsu = new int[size];

        int odd = 0, even = 0;

        for (int i = 0; i < jumsu.length; i++) {

            System.out.printf((i + 1) + "번째 요소 입력 받기 : ");
            jumsu[i] = scan.nextInt();

            if (jumsu[i] % 2 == 0) {
                even += jumsu[i];
            } else {
                odd += jumsu[i];
            }

        }
        System.out.println("홀수의 총합 : " + odd);
        System.out.println("짝수의 총합 : " + even);

        scan.close();

    }
}
