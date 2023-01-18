package ch01_variable_operator;

public class Add {
    public static void main(String[] args) {
        // 변수 선언(정의)
        int x ; // 정수형 데이터를 저장하기 위하여 변수 x를 준비해주세요.
        int y, z ; // 정수가 2개 필요해요.

        // 값을 대입(할당) assign
        // =를 대입 연산자라고 부름
        x = 3 ; // writer
        y = 5 ;
        z = x + y ; // z = 3 + 5

        // +의 2가지 역할) (1) 덧셈 (2) 문자열 결합
        System.out.println(x + " 더하기 " + y + "는(은) " + z + "입니다." );

        x = 4 ; // overwrite
        y = 9 ;
        z = x * y ;

        System.out.println(x + " 곱하기 " + y + "는(은) " + z + "입니다." );

    }
}
