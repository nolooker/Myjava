package ch02_control_statement;
import java.util.Random;
import java.util.Scanner;

public class WhileTest2 {
    public static void main(String[] args) {
//        Random rand = new Random(); // rand 객체
//        for (int i = 0; i < 10 ; i++) {
//            // nextInt 메소드는 정수 추출하는 동작
//            int rnd = rand.nextInt(100) + 1;
//            System.out.println(rnd);
//        }

        Scanner scan = new Scanner(System.in) ;

        int total = 0 ; // 총점
        int count = 0 ; // 입력된 데이터 갯수

        while(true){ // while 무한 루프
            System.out.print("점수 입력 : ");
            int grade = scan.nextInt() ;

            if(grade <= 0){
                System.out.println("0 또는 음수이어서 종료합니다.");
                break ;
            }

            total += grade ;
            count++ ;
        }
        double average = (double)total / count ;

        System.out.println("총 빈도수 : " + count);
        System.out.println("총점 : " + total);
        System.out.printf("평균 : %.3f\n", average);

        scan.close();
    }
}
