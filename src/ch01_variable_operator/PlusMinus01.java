package ch01_variable_operator;

public class PlusMinus01 {
    public static void main(String[] args) {
        int a = 10, b = 20, c ;

        c = ++a + b++ ;

        System.out.println("a : "+ a); //11
        System.out.println("b : "+ b); //21
        System.out.println("c : "+ c); //31

        c = a++ + --b ;

        System.out.println("a : "+ a);
        System.out.println("b : "+ b);
        System.out.println("c : "+ c);

        a = 15 ;
        b = 12 ;
        c = --a + --b ;

        System.out.println("a : "+ a);
        System.out.println("b : "+ b);
        System.out.println("c : "+ c);
    }
}
