package ch11_lamdba_expression.lambdatest;

public class SumToNMain {
    public static void main(String[] args) {
        SumToN sumToN = (x) -> {
            int total = 0;
            for (int i = 1; i <= x ; i++) {
                total += i ;
            }
            return total;
        };

        System.out.println("인터페이스형 변수를 이용한 람다식 구현부 호출하기");
        int result = sumToN.sum(10) ;
        System.out.println("결과01 : " + result);

        System.out.println("람다식과 정수를 매개 변수로 넘겨 주는 방식");
        staticSumToN(sumToN, 100); //

        SumToN plus5 = returnLambda() ;
        int[] arr = {10, 20, 30};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("plus5.sum(arr[" + i + "]) = " + plus5.sum(arr[i]));
        }
    }

    private static void staticSumToN(SumToN sumToN, int su) {
        System.out.println("결과02 : " + sumToN.sum(su));
    }

    public static SumToN returnLambda() {         //반환 값으로 사용
        return (su) -> {return su + 5; };
    }
}
