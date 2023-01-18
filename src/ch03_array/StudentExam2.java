package ch03_array;

import java.util.Scanner;

public class StudentExam2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;

        System.out.print("학생 수 입력 : ") ;
        // 학생 숫자가 2차원 배열의 행이 됩니다.
        int row = scan.nextInt() ;
        int column = 3 ; // 시험 점수(국어, 영어, 수학)
        String[] name = new String[row] ; // for 학생 이름

        double[][] jumsu = new double[row][column] ;

        for (int i = 0; i < row; i++) {
            System.out.print((i+1) + "번째 학생 이름 입력 : "); // for 이름
            name[i] = scan.next();

            double total = 0.0 ;

            for (int j = 0; j < column; j++) { // for 점수
                System.out.print((j+1) + "번째 점수 입력 : ");
                jumsu[i][j] = scan.nextDouble() ;
                total += jumsu[i][j];
            }
            double average = total / column ;

            String imsi = "\n%d번째 학생의 정보\n" ;
            imsi += "이름 : %s, 총점 : %.2f, 평균 : %.2f\n\n" ;

            System.out.printf(imsi, (i+1), name[i], total, average) ;
        }
        scan.close();
    }
}
/*
풀이 절차
학생 수를 키보드로 입력 받습니다.
학생 이름과 점수를 저장할 배열을 각각 정의합니다.
외부 반복문
    학생 이름을 입력 받습니다.
    내부 반복문
        학생별 점수들을 입력 받습니다.

외부 반복문
    총점 변수를 정의합니다.
    내부 반복문
        학생별 점수들을 총점에 합산합니다.
    평균 값을 구합니다.
    학생 이름과 총점과 평균을 출력합니다.
*/