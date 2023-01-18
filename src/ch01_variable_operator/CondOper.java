package ch01_variable_operator;

public class CondOper {
    public static void main(String[] args) {
        int x = 3, y = 8, z = 4 ;
        int max = x > y ? x : y ;
        max = max > z ? max : z ;
        System.out.println("최대 : " + max);

        // 최소 값은 ?
        int min = x < y ? x : y ;
        min = min < z ? min : z ;
        System.out.println("최소 : " + min);

        max = x > y ? (x > z ? x : z) : (y > z ? y : z)  ;
        System.out.println("최대 : " + max);

        min = x < y ? (x < z ? x : z) : (y < z ? y : z)  ;
        System.out.println("최소 : " + min);
    }
}