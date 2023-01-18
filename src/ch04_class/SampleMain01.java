package ch04_class;

public class SampleMain01 {
    public static void main(String[] args) {

        Sample01 Jang = new Sample01() ;
        Sample01 Bae = new Sample01() ;

        Jang.where = "스키장" ;
        Jang.name = "장희건" ;
        Jang.equip = "스키" ;
        Jang.rate = 1000 ;

        Bae.where = "스키장" ;
        Bae.name = "배준영" ;
        Bae.equip = "스키" ;
        Bae.rate = 500 ;


        System.out.println("여행지 : " +Jang.where);
        System.out.println("이름 : " +Jang.name);
        System.out.println("대여장비 : " +Jang.equip);
        System.out.println("대여금 : " +Jang.rate);

        System.out.println();

        System.out.println("여행지 : " + Bae.where);
        System.out.println("이름 : " + Bae.name);
        System.out.println("대여장비 : " +Bae.equip);
        System.out.println("대여금 : " +Bae.rate);



    }
}
