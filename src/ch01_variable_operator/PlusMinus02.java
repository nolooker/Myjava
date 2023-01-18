package ch01_variable_operator;

public class PlusMinus02 {
    public static void main(String[] args) {
        int x = 3, y = 5, z ;

        z = x++ + --y ;

        System.out.println("x : "+ x); //11
        System.out.println("y : "+ y); //21
        System.out.println("z : "+ z); //31

        z += --x + y++ ;

        System.out.println("x : "+ x);
        System.out.println("y : "+ y);
        System.out.println("z : "+ z);
    }
}
