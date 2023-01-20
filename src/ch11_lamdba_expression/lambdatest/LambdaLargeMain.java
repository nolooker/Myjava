package ch11_lamdba_expression.lambdatest;

public class LambdaLargeMain {
    public static void main(String[] args) {
        System.out.println("익명 클래스로 구현하기(기존 방식)");
        LambdaLarge big = new LambdaLarge() {
            @Override
            public int large(int su01, int su02) {
                return (su01 >= su02) ? su01 : su02 ;
            }
        };
        int su01 = 10, su02 = 20 ;
        System.out.println(big.large(su01, su02));

        System.out.println("max를 '인터페이스형 변수'라고 합니다.");
        LambdaLarge max = (x, y) -> (x>= y) ? x : y ;

        su01 = 14 ;
        su02 = 5;
        System.out.println("'인터페이스형 변수'에 dot 연산자를 이용하여 해당 추상 메소드를 호출하면 됩니다.");
        System.out.println(max.large(su01, su02));
    }
}
