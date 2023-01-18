package ch06_abstract_interface.cartest;

public class Avante extends Car {
    private String comment ;

    @Override
    public String toString() {
        String imsi = "코멘트 : " + comment ;
        return super.toString() + "\n" + imsi ;
    }

    @Override
    public void display() {
        String imsi = "%s의 현재 속도는 %dkm입니다.\n" ;
        System.out.printf(imsi, super.getName(), super.getSpeed()) ;
    }

    @Override
    public void speedup(int su) {
        super.setSpeed(+su);
    }
    @Override
    public void speeddown(int su) {
        super.setSpeed(-su);
    }

    public Avante(String name, int price, String comment) {
        super(name, price);
        this.comment = comment ;
    }
}
