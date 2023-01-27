package ch11_lamdba_expression.lambdatest;

public class ArithmethicMain02 {
    public static void main(String[] args) {
        int su01 = 14 , su02 = 5 ;

        System.out.println("인터페이스형 변수 plus에 람다식을 대입하는 방식");
        Arithmethic plus = (first, second) ->  first + second ;
        System.out.println("덧셈 : " + plus.calc(su01, su02));

        System.out.println("람다식을 메소드의 매개 변수로 넘기는 방식");
        Arithmethic minus = (first, second) ->  first - second ;
        int result = minusMethod(minus);
        System.out.println("뺄셈 : " + result);

        Arithmethic multiply = (first, second) ->  first * second ;
        result = multiplyMethod(multiply);
        System.out.println("곱셈 : " + result);

        System.out.println("메소드의 반환 타입이 람다식");
        Arithmethic divide = divideMethod();
        System.out.println("나눗셈 : " + divide.calc(17, 3));
    }

    private static Arithmethic divideMethod() {
        return (asdf, qwert) ->  asdf / qwert ;
    }

    private static int multiplyMethod(Arithmethic qwert) {
        int a = 10, b = 3 ;
        return qwert.calc(a, b) ;
    }

    private static int minusMethod(Arithmethic qwert) {
        int a = 100, b = 30 ;
        return qwert.calc(a, b) ;
    }
}