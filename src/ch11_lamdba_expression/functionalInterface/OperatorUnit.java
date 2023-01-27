package ch11_lamdba_expression.functionalInterface;

import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class OperatorUnit {
    private int[] array ; // 랜덤한 숫자들을 저장하고 있는 배열
    public OperatorUnit(int[] array) {
        this.array = array ;
    }

    // IntBinaryOperator : 두 개의 int 타입에 대한 연산을 수행합니다.
    public int getMax(IntBinaryOperator operator) {
        int max = Integer.MIN_VALUE ; // 가장 적은 정수를 최대라고 가정하고,
        for(int number : this.array){
            // 배열 요소의 각각의 값과 비교를 수행합니다.
            max = operator.applyAsInt(max, number);
        }
        return max ;
    }

    public int getMin(IntBinaryOperator operator) {
        int min = Integer.MAX_VALUE ;
        for(int number : this.array){
            min = operator.applyAsInt(min, number);
        }
        return min ;
    }

    // IntUnaryOperator는 1개의 int 연산에 사용되는 함수형 인터페이스입니다.
    public int[] getSquare(IntUnaryOperator operator) {
        // 배열 newArray는 array와 요소 개수가 동일합니다.
        int[] newArray = new int[array.length];

        for (int i = 0; i < newArray.length ; i++) {
            // 기존 배열 요소 1개를 매개 변수로 넘겨 줍니다.
            newArray[i] = operator.applyAsInt(this.array[i]) ;
        }
        return newArray ;
    }

    private double[] celciousArr ; // 온도 정보를 저장하고 있는 배열
    public OperatorUnit(double[] celciousArr) {
        this.celciousArr = celciousArr ;
    }

    // UnaryOperator는 T를 연산하여 R을 반환해줍니다.
    public void getSumOfMultiple(UnaryOperator<Double> operator){
        for(double cel : celciousArr){
            double fahrenheit = operator.apply(cel);
            String message = "섭씨 %.3fC는 화씨 %.3fF입니다.\n" ;
            System.out.printf(message, cel, fahrenheit);
        }
    }

}
