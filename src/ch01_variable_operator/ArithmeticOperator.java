package ch01_variable_operator;

public class ArithmeticOperator {
    public static void main(String[] args) {
        int TIME = 4000 ;
        int imsi = TIME ; // 원본 데이터 보존

        int hour ;
        hour = imsi / 3600 ;
        imsi %= 3600 ; // 시(hour) 구한 다음 잔여 데이터

        int minute = imsi / 60 ;
        imsi %= 60 ; // 분(minute) 구한 다음 잔여 데이터

        int second = imsi ; // 나머지 모두를 초(second)에 할당

        System.out.print(TIME + "초는 ") ;
        System.out.print(hour + " 시간, ") ;
        System.out.print(minute + " 분, ") ;
        System.out.println(second + " 초 입니다.") ;
    }
}