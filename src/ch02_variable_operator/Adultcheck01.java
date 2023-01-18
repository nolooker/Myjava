package ch02_variable_operator;

import java.util.Scanner;

public class Adultcheck01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;

        System.out.println("이름 입력 : ");
        String name = scan.next() ;

        System.out.println("나이 입력 : ");
        int age = scan.nextInt() ;


        System.out.println("성별( 1, 2, 3, 4 중 택일) 입력 : ");
        String adult ; //성인 판단 여부

        if (age >= 19) {
            adult = " 성인" ;

        }else {
            adult = " 미성년자 ";

        }

        System.out.println("성별 입력 : ");
        int _gender = scan.nextInt() ;

        String gender = _gender == 1 || _gender == 3 ? "남자" : "여자" ;


        System.out.println("이전 방식");
        System.out.println("이름 : " +name + "님");
        System.out.println("나이 : " +age + "세");
        System.out.println("성별 : " +gender + "");

        System.out.println("printf 메소드 사용하기");
        System.out.printf("이름 : %s님\n" , name);
        System.out.printf("나이 : %d세\n" , age);
        System.out.printf("성별 : %s\n" , gender);


        System.out.printf("이름은 %s이고, 나이는 %d세입니다. \n" , name , age);



        scan.close();

    }
}