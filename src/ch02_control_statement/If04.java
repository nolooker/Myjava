package ch02_control_statement;

import java.util.Scanner;

public class If04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("시험 점수 입력 : ");
        int score = scan.nextInt();

        if (score >= 90) {
            System.out.println("A 학점");

        }else if(score >= 80) {
            System.out.println("B 학점");

        }else if(score >= 70) {
            System.out.println("C 학점");

        }else if(score >= 60) {
            System.out.println("D 학점");

        }else{
            System.out.println("F 학점");
        }

        scan.close();
    }
}
