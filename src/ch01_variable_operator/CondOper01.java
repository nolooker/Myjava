package ch01_variable_operator;

public class CondOper01 {
    public static void main(String[] args) {

        // 최대값 변수 이름 : max

        int x = 3 ,y = 8 , z = 4 ;

        int max = x >= y ? x : y ;

        max = y >= z ? y : z ;

        max = y >= (x + z) ? y : z ;

        System.out.println("최대 수 : " + max);



    }
}
