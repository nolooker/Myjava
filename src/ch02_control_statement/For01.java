package ch02_control_statement;

public class For01 {
    public static void main(String[] args) {
        int total = 0  ;

        for (int i = 1; i < 11 ; i++) {
           // System.out.println( i  );
            total += i ;
        }
        System.out.println("총합1 : " + total);

        total = 0 ; // 초기화
        for (int i = 1; i < 101 ; i+=3) {
            total += i ;
        }
        System.out.println("총합2 : " + total);

        total = 0 ;
        for (int i = 97; i > 1 ; i-=5) {
            total += i ;
        }
        System.out.println("총합3 : " + total);

        total = 0 ;

        for (int i = 1; i < 97 ; i+=5) {
            total += i*i ;
        }
        System.out.println("총합 : " + total);

        // 1*2+2*3+3*4+4*5+5*6 = 70
        total = 0 ;

        for (int i = 1; i < 6 ; i++) {
            total += i * (i+1) ;
        }
        System.out.println("총합 : " + total);
    }
}
