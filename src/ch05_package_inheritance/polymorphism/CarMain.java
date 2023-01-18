package ch05_package_inheritance.polymorphism;

public class CarMain {
    public static void main(String[] args) {
        Person soo = new Person("김철수");
        Car car = null ; // 지역 변수
        car = new Avante("아반떼", 100, "가장 많은 판매");
        soo.ride(car);
        System.out.println("======================");

        Person hee = new Person("박영희") ;
        car = new Sonata("소나타", 200 , "중형 자동차");
        hee.ride(car) ;

        System.out.println("======================");
        Person minsik = new Person("최민식") ;
        car = new Grandeur("그랜져", 300, 24.1) ;
        minsik.ride(car) ;

        System.out.println("======================");
        System.out.println("new를 사용한 배열 정의");
        Car[] carlist = new Car[3] ; // 배열 정의
        carlist[0] = new Avante("아반떼2", 400, "단종ㅠㅠ");
        carlist[1] = new Sonata("소나타2", 500 , "현대");
        carlist[2] = new Grandeur("그랜져2", 600, 12.5) ;

        for (int i = 0; i < carlist.length; i++) {
            soo.ride(carlist[i]);
            System.out.println("======================");
        }

        System.out.println("배열 초기화 기법");
        Car[] cararray = {
                new Sonata("소나타3", 700 , "my car"),
                new Grandeur("그랜져3", 800, 15.8),
                new Avante("아반떼3", 900, "룰루~~랄라")
        };

        for (int i = 0; i < cararray.length; i++) {
            hee.ride(cararray[i]);
            System.out.println("======================");
        }
    }
}
