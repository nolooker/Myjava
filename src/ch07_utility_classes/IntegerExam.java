package ch07_utility_classes;

import java.util.Scanner;

public class IntegerExam {
    public static void main(String[] args) {
        int i = 10 ;

        System.out.println("최소 값 : " + Integer.MIN_VALUE);
        System.out.println("최대 값 : " + Integer.MAX_VALUE);
        System.out.println("자료형 공간 : " + Integer.BYTES + "바이트");

        System.out.println("Double 최소 값 : " + Double.MIN_VALUE);
        System.out.println("Double 최대 값 : " + Double.MAX_VALUE);
        System.out.println("Double 자료형 공간 : " + Double.BYTES + "바이트");

        String stri = Integer.toString(i);
        System.out.println("문자열 : " + stri);

        String binaryValue = Integer.toBinaryString(i);
        String octalValue = Integer.toOctalString(i);
        String hexValue = Integer.toHexString(i);

        System.out.println("2진수 : " + binaryValue);
        System.out.println("8진수 : " + octalValue);
        System.out.println("16진수 : " + hexValue);

        // 파싱(parsing)은 어떤 데이터가 적합한 데이터인지를 검증하는 절차
        // parseInt(문자열, [진법]) : 데이터를 정수형으로 파싱해주는 메소드
        String _age = "20" ;
        int age = Integer.parseInt(_age) ;
        System.out.println("나이 : " + age);

        int binaryDecimal = Integer.parseInt(binaryValue, 2) ;
        int octalDecimal = Integer.parseInt(octalValue, 8) ;
        int hexDecimal = Integer.parseInt(hexValue, 16) ;

        System.out.println("2진수를 10진 정수형으로 변환 : " + binaryDecimal);
        System.out.println("8진수를 10진 정수형으로 변환 : " + octalDecimal);
        System.out.println("16진수를 10진 정수형으로 변환 : " + hexDecimal);

        String str = "100" ; // 2진수 '100'은 10진수로 '4'입니다.
        int result = Integer.parseInt(str, 2) ;
        System.out.println("2진수 '100'은 10진수로 '4'입니다. : " + result);

        System.out.println("부호 메소드 사용");
        System.out.println("Integer.signum(50) : " + Integer.signum(50));
        System.out.println("Integer.signum(0) : " + Integer.signum(0));
        System.out.println("Integer.signum(-15) : " + Integer.signum(-15));

        Scanner scan = new Scanner(System.in) ;
        System.out.print("정수 입력 : ");
        String su01 = scan.next(); // 100 입력

        int su02 = Integer.parseInt(su01) + 300 ;
        System.out.println("300 더한 값 : " + su02);

        // 대부분의 wrapper 클래스에는 valueOf() 라는 메소드가 있습니다.
        // 이 메소드는 해당 클래스 타입으로 데이터를 형변환해주는 메소드입니다.
        // Integer.valueOf(), Double.valueOf(), ...
        int su03 = Integer.valueOf(su01) - 50 ;
        System.out.println("50 뺀 값 : " + su03);

        su02 = 20 ;
        su03 = 30 ;
        System.out.println("큰 수 : " + Integer.max(su02, su03));
        System.out.println("큰 수 : " + Integer.min(su02, su03));
        System.out.println("합치기 : " + Integer.sum(su02, su03));
    }
}
