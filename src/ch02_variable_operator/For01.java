package ch02_variable_operator;

public class For01 {
    public static void main(String[] args) {
        int total = 0 ;

        for( int i = 1 ; i < 11 ; i++){
           // System.out.println(i) ;

            total += i ;
        }

        System.out.println("총합1 : " +total);

        total = 0 ; //초기화

        for( int i = 1 ; i < 101 ; i += 3){
           // System.out.println(i) ;

            total += i ;
        }

        System.out.println("총합2 : " +total);

        total = 0 ;

        for( int i = 97 ; i > 1  ; i -= 5){
           // System.out.println(i) ;

            total += i ;
        }

        System.out.println("총합3 : " +total);

        total = 0 ;

        for( int i = 1 ; i <97 ; i += 5  ) {
            // System.out.println(i) ;

            total += i * i ;
        }

        System.out.println("총합4 : " +total);


    }



}
