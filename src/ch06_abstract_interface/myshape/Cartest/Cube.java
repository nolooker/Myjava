package ch06_abstract_interface.myshape.Cartest;

public class Cube extends Car {

    private double fuel ;

    public Cube(String name, int price, double fuel) {

        super(name,price) ;
        this.fuel = fuel ;

    }

    public void Display() {

        System.out.println("이름 : " +this.name);
        System.out.println("가격 : " +this.price);
        System.out.println("연비 : " +this.fuel);

    }
}
