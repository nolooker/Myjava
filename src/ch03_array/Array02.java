package ch03_array;

public class Array02 {
    public static void main(String[] args) {

        System.out.println("초기화 기법을 이용한 배열 정의");

        String[] bts = {"진", "뷔", "정국" , "rm", "지민" , "슈가" , "제이홉"} ;

        System.out.println("배열 요소 출력하기");

        for (int i = 0 ; i < bts.length ; i++) {

            System.out.println("bts[" +i +"] =" +bts[i]);
        }
    }
}
