package ch11_lamdba_expression.SumToN;

public class SumToNMain {
    public static void main(String[] args) {
        SumToN obj = (x) -> {

            int total = 0;
            for (int i = 1; i <= x; i++) {

                total += i;

            }
            return total;

        };

        System.out.println("인터페이스 형 변수를 이용한 람다식 구현부 호출하기");

        int result = obj.sum(10);
        System.out.println("결과01 : " + result);

        System.out.println("-------------------------------------------");

        System.out.println("람다식과 정수를 메소드의 매개 변수로 전송하는 방식");

        staticSumToN(obj, 100); // 매개 변수(SumToN의 람다식 , 정수)


        System.out.println("반환 타입이 SumToN 형 람다식인 메소드를 호출해 봅니다.");
        SumToN plus5 = returnLambda();

        int[] arr = {10, 20, 30};
        for (int i = 0; i < arr.length; i++) {

            System.out.println("plus5.sum(arr[" + i + "]) = " + plus5.sum(arr[i]));

        }

    }

    private static SumToN returnLambda() {

        // 메소드의 반환 타입이 SumToN 형식의 람다식이면 된다.
        return (su) -> {
            return (su + 5);
        };

    }

    private static void staticSumToN(SumToN asdf, int su) {

        // asdf 변수는 SumToN 타입이므로 sum() 메소드 호출이 가능
        // asdf의 sum() 메소드에 su 라는 값을 대입

        System.out.println("결과02 : " + asdf.sum(su));

    }
}
