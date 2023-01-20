package ch11_lamdba_expression.functionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.ObjIntConsumer;

public class AndThenCompose {
    public static void main(String[] args) {
        System.out.println("\nandThen 디폴트 메소드 사용하기");
        Consumer<Integer> add = (num)->System.out.println(num + " + 100 = " + (num + 100));

        Consumer<Integer> sub = (num)->System.out.println(num + " - 100 = " + (num - 100));

        Consumer<Integer> mul = (num)->System.out.println(num + " * 100 = " + (num * 100));

//        다음 예제는 Integer 타입인 매개변수의 값에 100을 더한 결과를 출력하는 add, 100을 뺄셈한 결과를 출력하는 ConsumerMinus, 100을 곱한 결과를 출력하는 mul이 존재합니다.
//        덧셈 → 뺄셈 → 곱셈 순서로 Consumer가 실행됩니다.
        add.andThen(sub.andThen(mul)).accept(50);

        ObjIntConsumer<Human> c6 = (a, b) -> System.out.println("이름 : "+ a.getName()+ ", 숫자 : "+ b);
        c6.accept(new Human("김철수", 5), 10);

        int sss = 100 ;

        Function<Integer, Integer> plus2 =
                (num) -> num + sss;

        Function <Integer, Integer> multiple2 =
                (num) -> num * 10;

        System.out.println("(50 * 10) + 100 = " +
                plus2.compose(multiple2).apply(50));
    }
}
