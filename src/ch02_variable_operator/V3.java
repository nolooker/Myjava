package ch02_variable_operator;

public class V3 {
    public static void main(String[] args) {

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i < 51; i++) {
            if (i % 3 == 0) {
                sum1 += i;
            } else {
                sum2 += i;
            }
        }
        int diff = sum2 - sum1;

        System.out.println("3의 배수의 총합 : " + sum1);
        System.out.println("3의 배수 외의 총합 : " + sum2);
        System.out.println("차이값 : " + diff);
    }

}
