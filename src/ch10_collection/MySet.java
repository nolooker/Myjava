package ch10_collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySet {
    public static void main(String[] args) {
        Set<Object> set = new HashSet<Object>();

        set.add("제시카"); // String -> Object
        set.add(123); // int -> Integer -> Object
        set.add(false); // boolean → Boolean → Object
        set.add("제시카");

        set.clear();

        set.add("제시카");
        set.add("티파니");
        set.add("수영");
        set.add("효연");

        System.out.println("써니 존재 여부 : " + set.contains("써니"));
        System.out.println("수영 존재 여부 : " + set.contains("수영"));

        // "써니"가 존재하지 않는지 확인하고, 없으면 추가해 보세요.
        if(set.contains("써니") == false){
            set.add("써니");
        }
        // "효연" 요소를 제거해 보세요.
        set.remove("효연");

        System.out.println("확장 for를 이용한 출력");
        for(Object item:set){
            System.out.println(item) ;
        }

        Object[] arr = set.toArray();
        System.out.println("확장 for를 이용한 배열 출력");
        for(Object item:arr){
            System.out.println(item) ;
        }

        Set<Integer> setA = new HashSet<Integer>();
        for (int i = 1; i <= 4 ; i++) {
            setA.add(i) ;
        }

        Set<Integer> setB = new HashSet<Integer>();
        setB.add(3) ;
        setB.add(4) ;
        setB.add(5) ;
        setB.add(6) ;

        Set<Integer> union = new HashSet<Integer>();
        union.addAll(setA) ;
        union.addAll(setB) ;
        System.out.println("합집합 : " + union.toString());

        Set<Integer> intersection = new HashSet<Integer>(setA);
        intersection.retainAll(setB) ;
        System.out.println("교집합 : " + intersection.toString());

        Set<Integer> minus01 = new HashSet<Integer>(setA);
        minus01.removeAll(setB);
        System.out.println("차집합(A-B)  : " + minus01.toString());

        Set<Integer> minus02 = new HashSet<Integer>(setB);
        minus02.removeAll(setA) ;
        System.out.println("차집합(B-A)  : " + minus02.toString());

        System.out.println("요소 개수 : " + set.size());

        System.out.println("컬렉션 중에서 Tree로 시작하는 항목들은 정렬되어 출력됩니다.");
        Set<String> treeset = new TreeSet<String>();
        treeset.add("홍길동");
        treeset.add("최영");
        treeset.add("김유신");
        treeset.add("이순신");

        for(String item:treeset){
            System.out.println(item) ;
        }
    }
}
