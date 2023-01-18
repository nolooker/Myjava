package ch05_package_inheritance.polymorphism;

public class CarOld {
    private String name ; // 이름
    private int price ; // 가격

    public CarOld(String name, int price) {
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
