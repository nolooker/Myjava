package ch11_lamdba_expression.lambdatest;

public class PrintNameAgeMain {
    public static void main(String[] args) {
        PrintNameAge obj = (name, age) -> {
            System.out.println("이름 : " + name + ", 나이 : " + age);
        };
        obj.print("김철수", 20);
    }
}
