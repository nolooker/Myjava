package ch06_abstract_interface.cartest;

public class Grandeur extends Car {
    private double fuel ;
    private String remark ; // 연비에 대한 메모

    public Grandeur(String name, int price, double fuel) {
        super(name, price);
        this.fuel = fuel ;

        if(this.fuel >= 20.0){
            this.remark = "excellent" ;
        }else if(this.fuel >= 15.0){
            this.remark = "good" ;
        }else{
            this.remark = "poor" ;
        }
    }

    public Grandeur(){}

    @Override
    public String toString() {
        String imsi = "연비 : " + fuel + "\n" ;
        imsi += "연비 메모 : " + remark ;
        return super.toString() + "\n" + imsi ;
    }


    @Override
    public void display() {
        String imsi = "%s의 현재 속도는 %.3fmile입니다.\n" ;
        double speed = (double)super.getSpeed()/1.6 ;
        System.out.printf(imsi, super.getName(), speed) ;
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
