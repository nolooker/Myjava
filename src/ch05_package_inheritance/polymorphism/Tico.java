package ch05_package_inheritance.polymorphism;

public class Tico extends Car {

    private String comment ; // 코멘트

    public Tico(String name, int price, String comment) {
        super(name, price);
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }
}
