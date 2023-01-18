package ch02_variable_operator;

public class Difference {
    public static void main(String[] args) {

        int sumA = 0 , sumB = 0 ;

        for ( int i =1 ; i < 51 ; i++  ) {

            if (i%3 == 0 ){
                sumB += i ;

            } else {
                sumA += i ;

            }
        }
        System.out.println("3의 배수의 총합 : " +sumB);
        System.out.println("3의 배수가 아닌 정수 총합 : " +sumA);
        System.out.println("두 값의 차이 : " +(sumA -sumB));

    }
}
