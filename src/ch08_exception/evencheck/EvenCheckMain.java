package ch08_exception.evencheck;

import java.util.Scanner;

public class EvenCheckMain {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in) ;

            EvenCheck err = null ;

            try {
                System.out.println("정수 1 개 입력 : ");
                int su = scan.nextInt();

                if (su / 2 != 0) {

                    String message = "짝수의 정수를 입력하셔야 합니다." ;

                    err = new EvenCheck(message) ;

                    throw err ;

                }else {
                    System.out.println("짝수 정상");
                }

            } catch (EvenCheck e) {
                System.out.println("오류 홀수의 숫자가 입력 되었습니다.") ;
                System.out.println("메시지 : " +e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
            }finally {
                scan.close();
            }


        }
}
