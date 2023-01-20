package ch11_lamdba_expression.functionalInterface;

import java.util.function.*;

public class ConsumerMain {
    public static void main(String[] args) {
        System.out.println("Consumer 인터페이스를 이용하여 람다 표현식으로 로직을 작성합니다.");
        System.out.println("추상 메소드 accept() 메소드에 매개 변수를 전달하여, 해당 값을 출력합니다.");
        Consumer<String> csmr = (param) -> System.out.println("입력 값 : "+ (param));
        csmr.accept("대한민국");

        System.out.println("\n배열을 사용하여 반복합니다.");
        String[] nation = {"미국", "일본", "중국"};
        for(String item : nation){
            csmr.accept(item);
        }

        System.out.println("\n이름과 나이 정보 출력하기");
        BiConsumer<String, Integer> bicsmr = (name, age) -> System.out.println("이름 : " + name + ", 나이 : " + age);
        bicsmr.accept("김철수", 30);
     
        final int BAE = 8 ;
        System.out.println("\n정수의 " + BAE + "배 값 출력하기");
        Consumer<Integer> baetimes = (num)->System.out.println(num + " * " + BAE + " = " + (num * BAE));

        for (int i = 0; i < 3 ; i++) {
            baetimes.accept(BAE*(i+1));
        }

        System.out.println("\n객체를 이용하는 방식");
        System.out.println("5년 뒤의 나이");
        ObjIntConsumer<Human> addAge = (a, b) -> System.out.println("이름 : "+ a.getName()+ ", 나이 : "+ (a.getAge() + b));
        addAge.accept(new Human("김철수", 25), 5);
    }
}
