package ch11_lamdba_expression.functionalInterface.streamtest;

import java.util.ArrayList;
import java.util.List;

public class CustomerMain {
	public static void main(String[] args) {
		Customer lee = new Customer("이순신", 40, "남자");
		Customer yusin = new Customer("김유신", 20, "남자");
		Customer shin = new Customer("신사임당", 13, "여자");

		List<Customer> customer = new ArrayList<>();
		customer.add(lee);
		customer.add(yusin);
		customer.add(shin);
		customer.add(new Customer("황진이", 50, "여자"));

		System.out.println("객체의 toString() 메소드 호출");
		customer.stream().forEach(item->System.out.println(item));

		System.out.println("\n고객 명단 추가된 순서대로 출력");
		customer.stream().map(c->c.getName()).forEach(s->System.out.println(s));

		int totalAge = customer.stream().mapToInt(c->c.getAge()).sum();
		System.out.println("\n나이의 총합 : " + totalAge + "세입니다");

		int upperAge = 20 ;
		System.out.println("\n" + upperAge + "세 이상 고객 명단 정렬하여 출력");
		customer.stream().filter(c->c.getAge() >= upperAge).map(c->c.getName()).sorted().forEach(s->System.out.println(s));

		String findGender = "여자" ;
		System.out.println("\n성별 [" + findGender + "]만 출력");
		customer.stream().filter(c->c.getGender().equals(findGender)).map(c->c.getName()).forEach(s->System.out.println(s));
	}
}
