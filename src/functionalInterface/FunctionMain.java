package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionMain {
    public static void main(String[] args) {
//        다음 예제는 apply() 메서드 사용 방법입니다.
//                먼저, 세 개의 Function 타입의 객체를 생성하며 특정 작업을 수행 후 값을 반환하는 람다 표현식을 할당합니다.
//
//        - plus 객체는 Integer 타입의 매개변수를 전달받아 100을 더한 결과를 문자열로 반환합니다.
//                - minus 객체는 Integer 타입의 매개변수를 전달받아 100을 뺄셈한 결과를 문자열로 반환합니다.
//                - multiple 객체는 Integer 타입의 매개변수를 전달받아 100을 곱한 결과를 문자열로 반환합니다.
        Function<Integer, String> plus =
                (num) -> Integer.toString(num + 100);

        Function<Integer, String> minus =
                (num) -> Integer.toString(num - 100);

        Function<Integer, String> multiple =
                (num) -> Integer.toString(num * 100);

        System.out.println("50 + 100 = " + plus.apply(50));
        System.out.println("50 - 100 = " + minus.apply(50));
        System.out.println("50 * 100 = " + multiple.apply(50));

        int sss = 100 ;

        Function<Integer, Integer> plus2 =
                (num) -> num + sss;

        Function <Integer, Integer> multiple2 =
                (num) -> num * 10;

        System.out.println("(50 * 10) + 100 = " +
                plus2.compose(multiple2).apply(50));

        System.out.println("객체와 연동하기");
        Saram st1 = new Saram("hong", "홍길동", 85, 60);

        //매핑 : Saram객체 - Saram의 Integer 값
        Function<Saram, Integer> function = (a) -> a.getKor();
        int result01 = function.apply(st1);
        System.out.println(st1.getName() + "의 국어 점수 : " + result01);

        //매핑 : 두 Integer 값 - Double 값
        BiFunction<Integer, Integer, Double> biFunction = (a, b) -> (double) ((a)+b)/2;
        double result02 = biFunction.apply(3, 5);
        System.out.println("두 숫자 평균 : "+ result02);
//
//
//        //매핑 : Double 값 - Integer 값
//        DoubleFunction<Integer> doubleFunction = (a) -> {
//            Double d = Math.floor((a));
//            return d.intValue();
//        };
//        int result03 = doubleFunction.apply(246.71);
//        System.out.println("소수점 버리기 : "+ result03);
//
//
//        //매핑 : Integer, Integer - Double
//        ToDoubleBiFunction<Integer, Integer> toDoubleBiFunction;
//        toDoubleBiFunction = (math, english) -> (double)(math+english)/2;
//        double result04 = toDoubleBiFunction.applyAsDouble(st1.math, st1.english);
//        System.out.println("홍길동의 수학 영어 평균 : "+ result04);
    }
}
