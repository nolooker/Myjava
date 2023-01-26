package ch11_lamdba_expression.Jegob;

public class JegobMain {
    public static void main(String[] args) {

        double su01 = 3.0 ;
        double su02 = 6.0 ;

        Jegob squareAdd = (first, second) -> (first*first) + (second*second) ;

        System.out.println("각 제곱의 합 : " +squareAdd.je(su01,su02));

        squareAdd = (first, second) -> (first*first) - (second*second) ;

        System.out.println("각 제곱의 뺄셈 : " +squareAdd.je(su01,su02));

        squareAdd = (first, second) -> (first*first) * (second*second) ;

        System.out.println("각 제곱의 곱 : " +squareAdd.je(su01,su02));

    }
}
