package ch03_array;

import java.util.Scanner;

public class Ans24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("배열 크기 입력 : ");
        int size = scan.nextInt() ;

        double[] score = new double[size];

        double total = 0.0 ;
        double average = 0.0 ;

        for (int i = 0; i < score.length; i++) {
            System.out.print((i+1) + "번째 요소 값 입력 : ");
            score[i] = scan.nextDouble();
            total += score[i] ;
        }

        average = total / size ;

        System.out.printf("총합 : %.2f\n", total);
        System.out.printf("평균 : %.2f\n", average);

        scan.close();
    }
}
