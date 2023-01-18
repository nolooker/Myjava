package ch06_abstract_interface.cartest;

import java.util.Random;

public class CarTest {
    public static void main(String[] args) {
        Random rand = new Random() ;

        Car[] mycar = {
                new Avante("아반떼", 100, "가장 많은 판매"),
                new Grandeur("그랜져", 200, 9.5),
                new Sonata("소나타", 300 , "현대")
        };

        for (int i = 0; i < mycar.length; i++) {
            System.out.println("====================================");
            int val = rand.nextInt(20) + 10 ;
            mycar[i].speedup(val); // 엑셀 밟기
            mycar[i].display();

            mycar[i].speedup(30); // 엑셀 밟기
            mycar[i].display();

            val = rand.nextInt(val) + 10 ;
            mycar[i].speeddown(val); // 브레이크 밟기
            mycar[i].display();

            //System.out.println("toString() 메소드 오버라이딩");
            System.out.println(mycar[i]) ;
        }
    }
}
