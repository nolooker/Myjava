package ch10_collection;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class MyMapExam {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("이름", "홍길동") ;
        map.put("국어", "60") ;
        map.put("영어", "80") ;

        System.out.println("before map");
        System.out.println(map.toString());

        final int BASIC_SCORE = 80 ;

        // 여기에 코딩
        int kor = map.get("국어") == null ? BASIC_SCORE : Integer.parseInt(map.get("국어"));
        int eng = map.get("영어") == null ? BASIC_SCORE : Integer.parseInt(map.get("영어"));
        int math = map.get("수학") == null ? BASIC_SCORE : Integer.parseInt(map.get("수학"));

        int total = kor + eng + math ;
        double average = (double)total / 3 ;

        String grade = ""; // 학점
        if(average >= 90.0){
            grade = "A" ;
        }else if(average >= 80.0){
            grade = "B" ;
        }else if(average >= 70.0){
            grade = "C" ;
        }else if(average >= 60.0){
            grade = "D" ;
        }else{
            grade = "F" ;
        }

        // 국영수) 존재 여부에 상관 없이 덮어 쓰기 시도
        map.put("국어", String.valueOf(kor)) ;
        map.put("영어", String.valueOf(eng)) ;
        map.put("수학", String.valueOf(math)) ;

        map.put("총점", String.valueOf(total)) ;
        map.put("평균", new DecimalFormat("##.00").format(average)) ;
        map.put("학점", grade) ;

        System.out.println("after map");
        System.out.println(map.toString());

    }
}
