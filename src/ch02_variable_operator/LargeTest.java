package ch02_variable_operator;

import java.util.Scanner;

public class LargeTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;

        System.out.println("1번째 정수 입력 : ");
        int su1 = scan.nextInt() ;

        System.out.println("2번째 정수 입력 : ");
        int su2 = scan.nextInt() ;

        System.out.println("1번째 정수 : " +su1);
        System.out.println("2번째 정수 : " +su2);

        if (su1 >= su2 ) {
            System.out.println("1번째 정수가 크거나 같습니다.");
            System.out.println("큰 수 : "+ su1);

        }else {
            System.out.println("2번째 정수가 더 큽니다.");
            System.out.println("큰 수 : " +su2);

            scan.close();

        }


    }
}
