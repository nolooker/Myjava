package ch02_variable_operator;

public class For07 {
    public static void main(String[] args) {

        double total = 0 ;

        for (int i = 1 ; i <101 ; i++) {

                total +=  i % 2 == 0  ?  -(double)1 / i : (double)1/i ;



        }

        System.out.println("총합 : " + total);
    }

}
