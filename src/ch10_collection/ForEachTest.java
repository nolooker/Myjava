package ch10_collection;

import java.util.*;

public class ForEachTest {
    public static void main(String[] args) {
        System.out.println("array forEach");
        String[] strArray = {"경기", "충청", "경상"};
        Arrays.stream(strArray).forEach((item) -> {
            System.out.println(item) ;
        });

        Set<String> set = new HashSet<>();
        set.add("Paris");
        set.add("Seoul");
        set.add("Tokyo");

        System.out.println("\nset forEach");
        set.forEach((item) -> {
            System.out.println(item);
        });

        List<String> lists = new ArrayList<>();
        lists.add("서울");
        lists.add("대전");
        lists.add("대구");

        System.out.println("\nlist forEach");
        lists.forEach((item) -> {
            System.out.println(lists.indexOf(item) + " : " + item);
        });

        List<Human> people = new ArrayList<Human>();
        people.add(new Human("철수", 10)) ;
        people.add(new Human("영희", 20)) ;
        System.out.println("\nlist forEach 2");
        people.forEach((item) -> {
            String name = item.getName() ;
            int age = item.getAge() ;
            String imsi = "이름 : %s, 나이 : %d\n";
            System.out.printf(imsi, name, age);
        });

        Map<String, String> map = new HashMap<String, String>();
        map.put("문형석", "더불어 민주당");
        map.put("홍건적", "자유 한국당");
        map.put("안유성", "국민 의당");

        System.out.println("\nmap forEach");
        map.forEach((strKey, strValue) -> {
            System.out.println(strKey + " : " + strValue);
        });
    }
}