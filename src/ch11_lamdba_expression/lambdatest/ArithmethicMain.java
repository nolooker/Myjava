package ch11_lamdba_expression.lambdatest;

public class ArithmethicMain {
    public static void main(String[] args) {
        int su01 = 14, su02 = 5 ;
        Arithmethic obj = (first, second) -> first + second;
        System.out.println("덧셈 : " + obj.calc(su01, su02));

        obj = (first, second) -> first - second;
        System.out.println("뺄셈 : " + obj.calc(su01, su02));

        obj = (first, second) -> first * second;
        System.out.println("곱셈 : " + obj.calc(su01, su02));

        su02 = 0 ;
        obj = (first, second) -> {
            if(second == 0){
                second = 5 ;
            }
            return first / second ;
        };
        System.out.println("나눗셈 : " + obj.calc(su01, su02));

    }
}
