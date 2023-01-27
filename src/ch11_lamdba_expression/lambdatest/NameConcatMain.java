package ch11_lamdba_expression.lambdatest;

public class NameConcatMain {
    public static void main(String[] args) {
        String husband = "김철수";
        String wife = "박영희";

        System.out.println("구현체 클래스를 이용한 객체 지향 프로그래밍 방식");
        NameConcat obj = new NameConcatImpl() ;
        obj.nameCombination(husband, wife);
        System.out.println();

        System.out.println("인터페이스를 람다 표현식으로 구현하기");
        NameConcat maksString = (man, woman) -> {
            System.out.println("남편 : " + man + "님, 아내 : " + woman + "님" );
        };
        maksString.nameCombination(husband, wife);
    }
}
