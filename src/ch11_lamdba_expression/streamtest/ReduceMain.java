package ch11_lamdba_expression.functionalInterface.streamtest;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ReduceMain {
    public static void main(String[] args) {
        // Stream.reduce(init, accumulator) 처럼 초기 값을 인자로 전달할 수 있습니다.
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer sum = Arrays.stream(numbers).reduce(0, (total, n) -> total + n);
        System.out.println("sum: " + sum);

        OptionalInt reduced =
                IntStream.range(1, 4) // [1, 2, 3]
                        .reduce((a, b) -> {
                            return Integer.sum(a, b);
                        });
        System.out.println(reduced.toString());
    }
}
