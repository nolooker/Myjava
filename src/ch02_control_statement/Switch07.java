package ch02_control_statement;

import java.util.Scanner;

public class Switch07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("주사위 눈 1개 입력 : ");
        int su = scan.nextInt();

        System.out.println("\n초급");
        switch (su){
            case 1 :
                System.out.println("홀수");
                break ;
            case 2 :
                System.out.println("짝수");
                break ;
            case 3 :
                System.out.println("홀수");
                break ;
            case 4 :
                System.out.println("짝수");
                break ;
            case 5 :
                System.out.println("홀수");
                break ;
            case 6 :
                System.out.println("짝수");
                break ;
        }

        System.out.println("\n중급");
        switch (su){
            case 1 : case 3 : case 5 :
                System.out.println("홀수");
                break ;

            case 2 : case 4 : case 6 :
                System.out.println("짝수");
                break ;
            default:
                System.out.println("이도 저도 아무것도 아닙니다.");
        }

        scan.close();
    }
}
