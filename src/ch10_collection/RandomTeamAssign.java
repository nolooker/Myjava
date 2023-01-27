package ch10_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class RandomTeamAssign {
    public static void main(String[] args) {
        // 다음 명단(24명)을 이용하여 6명씩 4개조로 만들어 보세요.
        String names = "김재혁,김창희,김하얀,김홍준,민경환,박진솔,박진주,백상우,변종민,서기은,서준혁,손유정,양경배,엄태현,위진희,유혜진,윤현우,이송민,이승혁,임한울,정소연,정영우,정지웅,최영민" ;

        String[] array = names.split(",") ;

        List<String> nameList = new ArrayList<String>();

        for(String item : array){
            nameList.add(item) ;
        }

        Collections.shuffle(nameList);
        System.out.println(nameList.toString());

        final int MemberSize = 6 ;

        int cnt = 0 ;
        for (int i = 0; i < nameList.size() ; i+=MemberSize) {
            List<String> sublist = nameList.subList(i, i + MemberSize) ;
            System.out.println(++cnt + "조 : " + sublist.toString());
        }

        // 출력 예시
        // 1조 : xxx, yyy
    }
}
