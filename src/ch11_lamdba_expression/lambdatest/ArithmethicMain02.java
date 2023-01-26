package ch11_lamdba_expression.lambdatest;

public class ArithmethicMain02 {
    public static void main(String[] args) {

        int su01 = 14, su02 = 5;

        System.out.println("인터페이스형 변수 plus에 람다식을 대입하는 방식");
        Arithmethic plus = (first, second) -> first + second;
        System.out.println("덧셈 : " + plus.calc(su01, su02));


        System.out.println("람다식을 메소드의 매개 변수로 넘기는 방식");
        Arithmethic minus = (first, second) -> first - second;
        int result = minusMethod(minus);
        System.out.println("뺄셈 : " + result);

        System.out.println("---------------------------------------");
        Arithmethic xpl = (first, second) -> first * second;
        System.out.println("곱셈 : " + xpl.calc(su01, su02));
    }

    private static int minusMethod(Arithmethic qwert) {

        int a = 100, b = 30;
        return qwert.calc(a, b);

    }
}
