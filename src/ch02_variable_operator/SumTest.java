package ch02_variable_operator;

public class SumTest {
    public static void main(String[] args) {

        int sumA = 0, sumB = 0, sumC = 0;


        for (int i = 1; i < 11; i++) {
            if (i % 3 == 0) {

                sumA += i;

            } else {
                if (i >= 5) {


                    if (i != 8) {

                        sumB += i;
                    }
                } else {
                    sumC += i;
                }
            }

        }

        System.out.println("3의 배수의 합 : " + sumA);
        System.out.println("3의 배수가 아니면서 " +
                "5보다 큰 8제외 숫자 : " + sumB);
        System.out.println("나머지 숫자 : " + sumC);

    }

}