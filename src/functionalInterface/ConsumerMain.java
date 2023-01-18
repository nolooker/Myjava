package functionalInterface;

import java.util.function.*;

public class ConsumerMain {
    public static void main(String[] args) {
        // accept() 메소드에 매개 변수를 전달하면, 람다 표현식으로 작성한 로직이 실행됩니다.
        // "대한민국"이라는 문자열이 param에 대입되고, 해당 값이 출력됩니다.
        Consumer<String> csmr = (param) -> System.out.println("입력 값 : "+ (param));
        csmr.accept("대한민국");

        String[] nation = {"미국", "일본", "중국"};
        for(String item : nation){
            csmr.accept(item);
        }

        System.out.println("이름과 나이 정보 출력하기");
        BiConsumer<String, Integer> bicsmr = (name, age) -> System.out.println("이름 : " + name + ", 나이 : " + age);
        bicsmr.accept("김철수", 30);
     
        final int BAE = 8 ;
        System.out.println("\n정수의 " + BAE + "배 값 출력하기");
        Consumer<Integer> baetimes = (num)->System.out.println(num + " * " + BAE + " = " + (num * BAE));

        for (int i = 0; i < 3 ; i++) {
            baetimes.accept(BAE*(i+1));
        }

        ObjDoubleConsumer<Human> c7 = (a, b) -> System.out.println("이름 : "+ a.getName()+ ", 숫자 : "+ b);
        c7.accept(new Human("김철수"), 12.34);
    }
}
