package ch01_variable_operator;

public class Operator01 {
    public static void main(String[] args) {
        int a = 10 , b = 8 ;

        boolean bool1 = a!=b ;
        boolean bool2 = --a == b++ ;
        // a = 9 , b = 9

        boolean bool3 = a++ != --b ;
        // a = 10 , b = 8

        boolean bool4 = bool3 && (5>7) ;
        boolean bool5 = !bool4 || (bool1 && bool2) ;

        System.out.println("bool1 : " + bool1);
        System.out.println("bool2 : " + bool2);
        System.out.println("bool3 : " + bool3);
        System.out.println("bool4 : " + bool4);
        System.out.println("bool5 : " + bool5);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

    }
}
