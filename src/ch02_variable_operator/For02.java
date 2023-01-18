package ch02_variable_operator;

public class For02 {
    public static void main(String[] args) {

        int odd = 0 , even = 0 ;

        for (int i= 1 ; i < 11 ; i++) {
            if (i%2 ==0 ) {
                even += i;
            }else {
                odd += i ;
            }
        }

        System.out.println("짝수의 총합 : " +even);
        System.out.println("홀수의 총합 : " +odd);



    }
}
