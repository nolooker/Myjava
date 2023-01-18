package ch02_variable_operator;

public class While02 {
    public static void main(String[] args) {
        int odd = 0;
        int even = 0;

        int i = 1 ;

        while (i < 11) {

           if (i % 2 == 0 ) {

               even += i ;
           }else {

               odd += i ;
           }

            i++;

        }

        System.out.println("홀수의 총합 : " + odd);
        System.out.println("짝수의 총합 : " + even);

    }

}
