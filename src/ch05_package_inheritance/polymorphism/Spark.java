package ch05_package_inheritance.polymorphism;

public class Spark extends Car{

    private String maker ; // ์ ์กฐ ํ์ฌ

    public Spark(String name, int price, String maker) {
        super(name, price);
        this.maker = maker;
    }

    public String getMaker() {
        return maker;
    }
}
