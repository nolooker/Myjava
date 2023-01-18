package ch01_variable_operator;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 3, b = 5 ;
        // result = condition ? truepart : falsepart ;
        // 조건(삼항) 연산자 : condition(조건식)이 참이면 truepart를, 거짓이면 falsepart를 실행하세요.
        int result = a > b ? a - b : b - a ;

        System.out.println("절대 값 : " + result);
    }
}
