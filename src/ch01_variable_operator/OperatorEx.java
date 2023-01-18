package ch01_variable_operator;

public class OperatorEx {
    public static void main(String[] args) {
        int a = 3 - -2, b = 3 ;
        int x = (a >= b) ? 5 : (a+2);

        x += ++a ;
        int y = ++a ;
        y += a + --b ;

        char ch3 = 'D' ;
        int z = ch3 >= 'A' && ch3 <= 'Z' ? --y : x + 2 ;

        int result = 0 ;
        result = x > y ? z - y : x + z ;
        System.out.println("result : " + result);
    }
}
