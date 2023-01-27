package ch11_lamdba_expression.functionalInterface;

import ch11_lamdba_expression.model.Human;
import ch11_lamdba_expression.model.Saram;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class ConsumerMain {
    public static void main(String[] args) {
        Consumer<String> csmr = (param) -> {
            System.out.println("입력 값 : " + param);
        };
        csmr.accept("대한민국");

        String[] nation = {"미국", "중국", "일본"};
        for (String item : nation){
            csmr.accept(item);
        }

        String[] members = {"김철수", "홍길동", "박영희"};
        // '김철수님' 반갑습니다. 의 형식으로 출력하는 Consumer 람다식 만들기
        Consumer<String> hello = (mem) -> {
            System.out.println("'" + mem + "'님 반갑습니다.");
        };
        for (String saram : members){
            hello.accept(saram);
        }

        BiConsumer<String, Integer> bicsmr = (name, age) -> {
            System.out.println("이름 : " + name + ", 나이 : " + age);
        } ;
        bicsmr.accept("김철수", 30);

        // 미성년자 체크) 컨슈머.accept("김철수", 12); -> '김철수'님은 미성년자입니다.
        BiConsumer<String, Integer> adultCheck = (name, age) -> {
            String result = age >= 19 ? "성인" : "미성년자" ;
            System.out.println("'" + name + "'님은 '" + result + "'입니다.");
        } ;
        adultCheck.accept("김철수", 12);

        final int BAE = 8 ;
        Consumer<Integer> baetimes = (num) -> {
            System.out.println(num + " * " + BAE + " = " + (num*BAE));
        };

        for (int i = 0; i < 3 ; i++) {
            baetimes.accept(BAE*(i+1));
        }

        // 1 * 1 = 1
        // 2 * 2 = 4
        // ...
        // 9 * 9 = 81
        Consumer<Integer> jegob = (num) -> {
            String message = "%d * %d = %2d\n";
            System.out.printf(message, num, num, (num*num));
        };
        for (int i = 1; i < 10 ; i++) {
            jegob.accept(i);
        }

        ObjIntConsumer<Human> addAge = (human, after) -> {
            String message = "이름 : %s, %d년 뒤 나이 : %d\n";
            System.out.printf(message, human.getName(), after, (human.getAge()+after));
        };
        int afterAge = 5 ;
        addAge.accept(new Human("김철수", 25), afterAge);

        // Saram 클래스와 ObjIntConsumer를 이용하여 다음 요구 사항대로 프로그램을 구현하세요.
        // 국영수 3 과목의 총점에 입력한 점수를 뺄샘하는 프로그램 구현
        // consumer.accept(new Saram(null, "김철수", 40, 50, 60), 30);
        // 출력 예시) 김철수 총점은 120입니다.
        ObjIntConsumer<Saram> minusTotal = (saram, minus) -> {
            String message = "%s님 총점은 (%d - %d) = %d점입니다.\n";
            int total = saram.getKor() + saram.getEng() + saram.getMath() ;
            System.out.printf(message, saram.getName(), total, minus, (total-minus));
        };
        int minusJumsu = 30 ;
        minusTotal.accept(new Saram(null, "김철수", 40, 50, 60), minusJumsu);
    }
}
