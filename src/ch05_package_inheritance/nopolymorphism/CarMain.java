package ch05_package_inheritance.nopolymorphism;

public class CarMain {
    public static void main(String[] args) {
        Person soo = new Person("김철수");
        Avante avante = new Avante("아반떼", 100, "가장 많은 판매");
        soo.ride(avante);
        System.out.println("======================");

        Person hee = new Person("박영희") ;
        Sonata sonata = new Sonata("소나타", 200 , "중형 자동차");
        hee.ride(sonata) ;

        System.out.println("======================");
        Person minsik = new Person("최민식") ;
        minsik.ride(new Grandeur("그랜져", 300, 24.1)) ;
    }
}
