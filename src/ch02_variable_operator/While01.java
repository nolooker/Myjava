package ch02_variable_operator;

public class While01 {
    public static void main(String[] args) {
        int total = 0;
        int i = 1;

        while (i < 11) {
            total += i;
            i++;

        }

        System.out.println("총합1 : " + total);

        total = 0;
        i = 1;

        while (i < 101) {
            total += i;
            i = i + 3;

        }

        System.out.println("총합2 : " + total);


        total = 0;
        i = 97;

        while (i > 1) {
            total += i;
            i = i - 5;

        }

        System.out.println("총합3 : " + total);


         total = 0 ;
         i = 1 ;

        while( i < 97){
            total += i * i ;
            i += 5 ;

        }

        System.out.println("총합4 : "+total);
    }

}
