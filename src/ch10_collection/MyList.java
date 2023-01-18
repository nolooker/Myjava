package ch10_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<String>() ;

        lists.add("bigbang") ;
        lists.add("2ne1") ;
        lists.add("wonder") ;
        lists.add("kara") ;
        lists.add("2ne1") ;

        int idx = -1 ;
        idx = lists.indexOf("2ne1") ;
        System.out.println(idx);

        idx = lists.lastIndexOf("2ne1") ;
        System.out.println(idx);

        idx = lists.indexOf("girls") ;
        System.out.println(idx);

        if(lists.indexOf("girls") == -1){
            lists.add(2, "girls") ;
        }

        System.out.println("확장 for를 이용한 출력");
        for(String item:lists){
            System.out.println(item);
        }

        lists.set(5, "2am") ;
        lists.remove("wonder") ;

        System.out.println("get(숫자) 메소드를 이용한 출력");
        String imsi = "" ;
        for (int i = 0; i < lists.size() ; i++) {
            imsi += lists.get(i) + "\t" ;
        }
        System.out.println(imsi);


        System.out.println("오름차순 정렬");
        Collections.sort(lists);
        System.out.println(lists.toString());

        System.out.println("내림차순 정렬");
        Collections.sort(lists, Collections.reverseOrder());
        System.out.println(lists.toString());

        System.out.println("요소 섞기");
        Collections.shuffle(lists);
        System.out.println(lists.toString());

        List<String> newlists = lists.subList(2, 4) ;
        System.out.println(newlists.toString());

        // 1, 2, 4를 추출하여 새로운 리스트 컬렉션을 만들려면 ?
        List<String> totallist = new ArrayList<String>() ;
        List<String> first = lists.subList(1, 3) ;
        List<String> second = lists.subList(4, 5) ;

        totallist.addAll(first) ;
        totallist.addAll(second) ;
        System.out.println(totallist.toString());



        System.out.println("요소 크기 : " + lists.size());
    }
}
