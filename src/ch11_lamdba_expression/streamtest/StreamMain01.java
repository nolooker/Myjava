package ch11_lamdba_expression.functionalInterface.streamtest;

import java.util.Arrays;

public class StreamMain01 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        Arrays.stream(arr).filter(s -> s >= 20).forEach(s -> System.out.println(s));

        System.out.println("long 타입을 int 타입으로 강등합니다.");
        int cnt = (int)Arrays.stream(arr).count() ;
        int total = Arrays.stream(arr).sum();

        System.out.println("배열 요소 개수 : " + cnt);
        System.out.println("배열 총합 : " + total);

        int word_len = 5 ;
        System.out.println(word_len + "글자 이상인 요소만 출력하기");
        String[] words = {"peach", "love", "cat", "wonderful"};
        Arrays.stream(words).filter(str -> str.length() >= word_len).forEach(str -> System.out.println(str));
    }
}
