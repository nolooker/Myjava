package ch02_variable_operator;

import java.util.Scanner;

public class if03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("정수 1개 입력 : ");
        int su = scan.nextInt();

        if (su % 3 == 0) {
            System.out.println(su + "는(은) 3의 배수 입니다.");
            System.out.println(su * su);
        }

        else {

            System.out.println(su + "는(은) 3의 배수가 아닙니다.");
            System.out.println(su + 5 );

        }

            scan.close();
        }
    }
