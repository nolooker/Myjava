package ch02_control_statement;

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("정수 1개 입력 : ");
        int su = scan.nextInt();

        if (su % 2 == 0){
            System.out.println(su + "는(은) 짝수");
            System.out.println("하하하");
        }else{
            System.out.println(su + "는(은) 홀수");
            System.out.println("호호호");
        }

        System.out.println("이 문장은 무조건 실행됨");
        scan.close();
    }
}
