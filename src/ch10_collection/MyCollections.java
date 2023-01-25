package ch10_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyCollections {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        for (int i = 1; i <= 20; i += 3) {
            list1.add(i);
        }

        System.out.println(list1.toString());

        int key = 10; // 찾고자 하는 데이터
        int index = Collections.binarySearch(list1, key);
        System.out.println("탐색의 반환 값 : " + index);
        System.out.println("즉, " + (index + 1) + "번째 요소입니다.");
        System.out.println("값 읽기 : " + list1.get(index));


        int startval = 1;
        int endval = 10;
        List<Integer> list2 = new ArrayList<Integer>();
        for (int i = startval; i <= endval; i++) {
            list2.add(i);
        }
        System.out.println(list2.toString());

        Collections.shuffle(list2);
        System.out.println(startval + "부터" + endval + "까지 랜덤하게 섞기");
        System.out.println(list2.toString());

        Student[] array = {

                new Student(202302, "홍길동"),
                new Student(202304, "박영희"),
                new Student(202301, "강감찬"),
                new Student(202303, "김철수")
        };

        List<Student> studentList = Arrays.asList(array);

        Collections.sort(studentList);

        System.out.println("오름차순 정렬 : " + studentList.toString());

        Collections.sort(studentList, Collections.reverseOrder());

        System.out.println("내림차순 정렬 : " + studentList.toString());


        List<Student2> student2List = new ArrayList<Student2>();

        student2List.add(new Student2("황길동", 1, 1));
        student2List.add(new Student2("심윤진", 1, 2));
        student2List.add(new Student2("김진혁", 2, 1));
        student2List.add(new Student2("공재숙", 2, 2));

        Collections.sort(student2List);
        System.out.println("오름차순 정렬 : " +student2List.toString());


        Collections.sort(student2List, Collections.reverseOrder());
        System.out.println("내림차순 정렬 : " +student2List.toString());
    }
}
