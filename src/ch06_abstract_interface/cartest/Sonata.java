package ch06_abstract_interface.cartest;

public class Sonata extends Car {
    private String maker ; // 메이커

    public Sonata(){}

    @Override
    public String toString() {
        String imsi = "메이커 : " + maker  ;
        return super.toString() + "\n" + imsi ;
    }

    public Sonata(String name, int price, String maker) {
        super(name, price);
        this.maker = maker ;
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
}
