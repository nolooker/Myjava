package ch01_variable_operator;

public class PrintMe {
    public static void main(String[] args) {
        String name ;
        int age ;

        double height ; // 큰 범주의 실수
        float weight ; // 큰 범주의 실수

        String blood = "AB" ; // 변수 선언하면서 값을 대입하기
        char munza ;
        boolean bool ; // 진위 값

        name = "홍길동" ;
        age = 27 ;
        height = 175.8 ;
        weight = 55.8f ; // float 타입은 f를 붙여 줘라.
        munza = 'Z' ;
        bool = false ;

        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("키 : " + height);
        System.out.println("혈액형 : " + blood);
        System.out.println("몸무게 : " + weight);
        System.out.println("글자 1개 : " + munza);
        System.out.println("진위 값 : " + bool);
    }
}
