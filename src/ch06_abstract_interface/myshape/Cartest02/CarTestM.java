package ch06_abstract_interface.myshape.Cartest02;

import java.util.Random;

public class CarTestM {
    public static void main(String[] args) {   //8
        Random rand = new Random() ;

        Car01[] mycar = new Car01[2] ;
        mycar[0] = new Tico01("티코",100,"작은 차") ;
        mycar[1] = new Cube01("큐브",200,9.5) ;

        for (int i = 0; i < mycar.length; i++) {   //10
            System.out.println("============================");
            int val = rand.nextInt(20) + 10 ;
            mycar[i].speedup(val) ;
            mycar[i].display() ;

            mycar[i].speedup(30) ;
            mycar[i].display() ;

            val = rand.nextInt(val) + 10 ;
            mycar[i].speeddown(val) ;
            mycar[i].display() ;

            //System.out.println("toString() 메소드 오버라이딩");
            System.out.println(mycar[i]);

        }
    }
}
