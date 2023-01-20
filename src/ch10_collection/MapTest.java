package ch10_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String,String>() ;

        map.put("문형석", "더불어 민주당") ;
        map.put("홍건적", "자유 한국당") ;
        map.put("안유성", "국민 의당") ;
        map.put("유준호", "바른 정당") ;
        map.put("심지효", "정의당") ;

        String find = "후보자" ;

        System.out.println("후보자를 입력");

        Set<String> who = map.keySet() ;
        System.out.println(who.toString());

        for (String name : who){

            String pick = map.get(name) ;
            String imsi = "후보자 : %s, 당이름 : %d\n" ;
            System.out.printf(imsi,pick,who);

        }



        System.out.println("자료 확인 : " +map.toString());
        System.out.println("요소 확인 : " +map.size());
    }



}

