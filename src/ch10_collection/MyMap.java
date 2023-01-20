package ch10_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MyMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>() ;

        map.put("KT", 1);
        map.put("두산", 2);
        map.put("삼성", 3);
        map.put("LG", 4);

        String findteam = "NC" ;
        boolean bool = map.containsKey(findteam) ;
        System.out.println(findteam + " 팀이 존재하나요? " + bool);

        // "NC" 팀이 존재하는 지 확인하고, 없으면 7위로 추가하기
        findteam = "NC" ;
        if(map.containsKey(findteam) == false){
            map.put(findteam, 7);
        }

        final int pos = 5 ;
        System.out.println("순위가 " + pos + "위인 팀이 있는지 확인해 보세요.");

        if(map.containsValue(pos) == true){
            System.out.println(pos + "위 팀은 존재합니다.");
        }else{
            System.out.println(pos + "위 팀은 존재하지 않습니다.");
        }

        // "삼성" 팀을 8위로 변경해 보세요.
        map.put("삼성", 8);
        System.out.println("존재하는 key에 대한 put() 메소드 동작은 덮어 쓰기(overwrite)가 됩니다.");

        // "두산" 팀을 목록에서 제외하세요.
        map.remove("두산");

        // "LG"의 순위를 확인해 보세요.
        findteam = "LG" ;
        Object rank = map.get(findteam) ;
        System.out.println(findteam + " 순위 : " + rank);

        // "KT"와 "NC"의 순위를 배열을 사용하여 처리하여 확인해 보세요.
        String[] teams = {"KT", "NC"};
        for (int i = 0; i < teams.length ; i++) {
            rank = map.get(teams[i]) ;
            System.out.println(teams[i] + " 순위 : " + rank);
        }

        // get() 메소드를 사용하여 "한화" 팀이 존재하는 지 확인하고, 존재하지 않으면 순위 3으로 추가하세요.
        findteam = "한화" ;
        rank = map.get(findteam);
        if(rank != null){
            System.out.println(findteam + " 순위 : " + rank);
        }else{
            System.out.println(findteam + " 팀이 존재하지 않으므로, 추가하겠습니다.");
            map.put(findteam, 3) ;
        }

        map.put("SSG", 2);
        map.put("KIA", 6);
        map.put("키움", 5);

        System.out.println("keylist는 팀명들의 이름을 저장하고 있는 열쇠 꾸러미입니다.");
        Set<String> keylist = map.keySet();
        System.out.println(keylist.toString());
        for(String key:keylist){
            Integer value = map.get(key) ;
            String imsi = "팀명 : %s, 순위 : %d\n" ;
            System.out.printf(imsi, key,value);
        }

        // "NC"와 "삼성"은 순위 1빼기, "LG"는 순위를 1 더하기를 해봅니다.
        keylist = map.keySet();
        for(String key:keylist){
            Integer value = map.get(key) ;
            if(key.equalsIgnoreCase("NC") || key.equalsIgnoreCase("삼성")){
                map.put(key, value-1) ;
            }else if(key.equalsIgnoreCase("LG")){
                map.put(key, value+1) ;
            }else{

            }
        }

        System.out.println("자료 확인 : " + map.toString());

        map.clear();
        if(map.isEmpty()){
            System.out.println("map is empty");
        }else{
            System.out.println("map is not empty");
        }

        System.out.println("요소 크기 : " + map.size());
    }
}
