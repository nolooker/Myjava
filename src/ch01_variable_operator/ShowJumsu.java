package ch01_variable_operator;

public class ShowJumsu {
    public static void main(String[] args) {
        String name ;
        double kor, eng ;
        double average ;

        name = "홍길동" ;
        kor = 40.0 ;
        eng = 43.0 ;
        average = (kor + eng) / 2.0 ;

        System.out.println("이름 : " + name);
        System.out.println("국어 : " + kor);
        System.out.println("영어 : " + eng);
        System.out.println("평균 : " + average);
    }
}
