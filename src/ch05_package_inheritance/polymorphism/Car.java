package ch05_package_inheritance.polymorphism;

public class Car {
    private String name ; // 이름
    private int price ; // 가격

    public Car(String name, int price) {
        this.name = name ;
        this.price = price ;
    }


    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
