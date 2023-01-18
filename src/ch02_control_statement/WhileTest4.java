package ch02_control_statement;
import java.util.Scanner;

public class WhileTest4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;

        int total = 0 ; // 총점
        int count = 0 ; // 입력된 데이터 갯수

        while(true){ // while 무한 루프
            System.out.print("점수 입력 : ");
            int grade = scan.nextInt() ;

            if(grade < -10){ // 숫자가 -10 미만인 경우에 대한 처리
                System.out.printf("숫자 %d이(가) 입력되었습니다.\n", grade);
                System.out.println("프로그램을 종료합니다.");
                break ;

            }else if(grade < 0){ // -10 이상의 음수에 대한 처리
                grade = Math.abs(grade) ;
            }else{

            }

            total += grade ;
            count++ ;
        }
        double average = (double)total / count ;

        System.out.println("총 빈도수 : " + count);
        System.out.println("총점 : " + total);
        System.out.printf("평균 : %.2f\n", average);

        scan.close();
    }
}
