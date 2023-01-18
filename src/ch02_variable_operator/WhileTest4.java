package ch02_variable_operator;

import java.util.Scanner;

public class WhileTest4 {
    public static void main(String[] args) {

        //문제
        //WhileTest4.java
        //WhileTest2의 문제를 다시 풀어 보세요.
        //
        //단, 숫자가 -10 미만인 경우에 한하여 프로그램을 종료합니다.
        //-10 이상의 음수는 절대 값으로 변경하여 카운터에 반영하도록 합니다.


//        Random rand = new Random(); // rand 객체
//        for (int i = 0 ; i < 10 ; i++ ) {
//            int rnd = rand.nextInt(100) +1 ;
//
//            System.out.println(rnd);
//        }
        Scanner scan = new Scanner(System.in);

        int total = 0 ; // 총점
        int count = 0 ; // 입력된 데이터 갯수
        double average = 0 ; // 평균값

        while (true) { //while 무한 루프
            System.out.print("점수 입력 : ");
            int grade = scan.nextInt();

            if (grade < -10) { // 숫자가 -10 미만인 경우에 대한 처리

                System.out.printf(" 숫자 %d 이(가) 입력되었습니다. \n" ,grade);
                System.out.println("프로그램을 종료합니다.");
                break;

            } else if (grade < 0) { // -10 이상의 음수에 대한 처리

                grade = Math.abs(grade);

            }

            total += grade ;

            count++ ;

        }
        average = (double) total/count ;

        System.out.println("총 빈도수 : " +count);
        System.out.println("총점 : " + total);
        System.out.printf("평균 : %.3f\n " , average);



        scan.close();
    }
}
