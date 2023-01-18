package ch01_variable_operator;

public class Casting {
    public static void main(String[] args) {
        double d = 100 ; // 암시적 형변환
        System.out.println("d : " + d);

        // 명시적 형변환
        int i = (int)12.5 ; // (int)를 캐스트 연산자라고 합니다.
        System.out.println("i : " + i);

        System.out.println(14/5);

        // (double)14/5 -> 14.0/5 -> 14.0/5.0 -> 2.8
        System.out.println((double)14/5);

        // (double)(14/5) -> (double)(2) -> 2.0
        System.out.println((double)(14/5));

        int kor = 50, eng = 60, math = 80 ;
        int total = kor + eng + math ;
        System.out.println("총점 : " + total);

        double average = (double)total / 3 ;
        System.out.println("평균 : " + average);

        char ch1 = 'c' ;
        char ch2 = 'a' ;
        boolean bool = ch1 > ch2 ; // 99 > 97
        System.out.println("bool : " + bool);

        int result = ch1 - ch2 + 5 ; // 99 - 97 + 5
        System.out.println("result : " + result);

        char ch3 = 'D' ;
        String str = ch3 >= 'A' && ch3 <= 'Z' ? "대문자 맞음" : "대문자 아님" ;
        System.out.println("대문자 판단 : " + str);

        char ch4 = 'e' ; // 숫자 101
        char munja = (char)(ch4 - ('a' - 'A')) ;
        System.out.println(munja);
    }
}