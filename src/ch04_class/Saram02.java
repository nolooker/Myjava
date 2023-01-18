package ch04_class;

public class Saram02 {

    static String nationality = "대한 민국" ; // 스태틱 변수 = 클래스 변수
    // 클래스 이름으로 접근 가능하므로 클래스 변수라고 부르기도 합니다.

    // 나머지는 멤버 변수 = instance(인스턴스) 변수
    String name ;
    double height ;
    double weight ;
    String hobby ;
    String blood ;

    // 실수 2개를 이용하여 평균 구하기
    double avg(double x, double y){
        // 지역 변수는 반드시 초기화 하세요.
        int a ;
        //System.out.println(a);

        // final 키워드는 read only 개념으로 이해 바랍니다.
        final double PI = 3.14 ; // 상수(constant)
        //PI = 5.14 ;
        System.out.println(PI);

        double result = (x + y) / 2.0 ;
        return result ;
    }
}
