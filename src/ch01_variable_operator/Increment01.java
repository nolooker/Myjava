package ch01_variable_operator;

public class Increment01 {
    public static void main(String[] args) {
        // = 기호는 대입(assign) 연산자입니다.
        int x = 5 ; // 변수 x를 정의한 다음, 5를 대입(writer)합니다.

        //x = x + 3 ; // 누적
        x += 3 ; // 누적
        System.out.println("x : " + x);

        x *= 4 ;
        System.out.println("x : " + x);

        x %= 5 ;
        System.out.println("x : " + x);

        x -= 1 ;
        System.out.println("x : " + x);

        x += 7 ;
        System.out.println("x : " + x);

        int total = 0 ;
        total += 1 ;
        total += 2 ;
        total += 3 ;
        total += 4 ;
        total += 5 ;
        total += 6 ;
        total += 7 ;
        total += 8 ;
        total += 9 ;
        total += 10 ;
        System.out.println("total : " + total);
    }
}
