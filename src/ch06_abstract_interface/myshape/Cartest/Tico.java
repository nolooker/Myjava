package ch06_abstract_interface.myshape.Cartest;

public class Tico extends Car{

    private String comment ;

    public Tico(String name, int price, String comment) {

        super(name,price);
        this.comment = comment ;


    }

    public void Display() {

        System.out.println("======================================");

        System.out.println("이름 : " +this.name);
        System.out.println("가격 : " +this.price);
        System.out.println("코멘트 : " +this.comment);

        System.out.println("======================================");

    }

}
