package ch11_lamdba_expression.functionalInterface;

import ch11_lamdba_expression.model.Saram;

import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.Function;

public class FunctionMain01 {
    public static void main(String[] args) {
        final int SU = 10 ;

        System.out.println("정수 객체를 문자열 타입으로 반환");
        Function<Integer, String> plus = (num) -> Integer.toString(num + SU) ;
        Function<Integer, String> minus = (num) -> Integer.toString(num - SU) ;

        int su01 = 14 ;
        System.out.println("더하기 : " + plus.apply(su01));
        System.out.println("빼기 : " + minus.apply(su01));

        System.out.println("정수 2개의 산술 평균을 double 타입으로 반환");
        BiFunction<Integer, Integer, Double> biFunction
                = (first, second) -> ((double)first+second)/2 ;
        double result02 = biFunction.apply(30, 40) ;
        System.out.println("두 숫자 산술 평균 : " + result02);

        System.out.println("객체와 연동하기");
        Saram hong = new Saram("hong", "홍길동", 80, 60, 50);
        String message = "%s님의 국어/영어 평균 점수 : %.3f\n" ;
        System.out.printf(message, hong.getName(), biFunction.apply(hong.getKor(), hong.getEng()) );

        Function<Saram, Integer> getTotal = (saram) -> saram.getKor()+saram.getEng()+saram.getMath();
        int totalJumsu = getTotal.apply(hong);
        message = "%s님의 총점 : %3d\n" ;
        System.out.printf(message, hong.getName(), totalJumsu);

        System.out.println("Double 타입을 Integer 타입으로 변환하기");
        DoubleFunction<Integer> double2Int = (asdf) -> {
            Double result = Math.ceil(asdf) ;
            return result.intValue() ;
        } ;

        double su = 153.4 ; // 올림하면 154
        System.out.println("실수형 올림 : " + double2Int.apply(su));

        System.out.println("실수형 배열 요소를 올림하여 정수형 배열 만들기");
        double[] dArr = {15.4, 18.5, 23.1} ;

        int[] iArr = new int[dArr.length] ;

        for (int i = 0; i < iArr.length ; i++) {
            iArr[i] = double2Int.apply(dArr[i]) ;
        }

        for(int item : iArr){
            System.out.println(item);
        }
    }
}
