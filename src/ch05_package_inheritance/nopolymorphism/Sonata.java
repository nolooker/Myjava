package ch05_package_inheritance.nopolymorphism;

public class Sonata {
    private String name ;
    private int price ;
    private String maker ; // 제조 회사

    public Sonata(String name, int price, String maker) {
        this.name = name;
        this.price = price;
        this.maker = maker;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getMaker() {
        return maker;
    }
}
