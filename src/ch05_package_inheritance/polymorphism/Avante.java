package ch05_package_inheritance.polymorphism;

public class Avante extends Car {

    private String comment ; // 코멘트

    public Avante(String name, int price, String comment) {
        super(name, price);
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }
}
