package ch01_variable_operator;

public class LogicalOperator {
    public static void main(String[] args) {
        // hard coding
        System.out.println(3 >= 2);
        System.out.println(!(3 >= 2));
        System.out.println(3 == 2);
        System.out.println(3 != 2);
        System.out.println(3.45 < 2);

        System.out.println("------------------------------");

        System.out.println((3>2) && (3>4));

        int x = 3, y = 2 ;
        System.out.println((x != y) || (-1 > 0));

        // 문자는 정수 값으로 변환되어 연산이 됩니다.
        System.out.println('a' > 'b');
    }
}
