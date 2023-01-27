package ch11_lamdba_expression.lambdatest;

public class PrintNameAgeMain {
    public static void main(String[] args) {
        PrintNameAge anno = new PrintNameAge() {
            @Override
            public void print(String name, int age) {
                String message = "안녕하세요~~%d세, %s이라고 합니다.\n";
                System.out.printf(message, age, name);
            }
        };
        anno.print("홍길동", 12);

        PrintNameAge obj = (name, age) -> {
            System.out.println("이름 : " + name + ", 나이 : " + age);
        };
        obj.print("김철수", 20);

        PrintNameAge another = (name, age) -> {
            String message = "제 이름은 %s이고, 나이는 %d세입니다.";
            System.out.printf(message, name, age);
        };
        another.print("박영희", 35);
    }
}