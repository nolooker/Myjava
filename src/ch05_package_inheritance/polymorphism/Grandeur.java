package ch05_package_inheritance.polymorphism;

public class Grandeur extends Car{
    private double fuel ; // 연비
    private String remark ; // 연비에 대한 메모

    public String getRemark() {
        return remark;
    }

    public Grandeur(String name, int price, double fuel) {
        super(name, price);
        this.fuel = fuel;

        if(this.fuel >= 20.0){
            this.remark = "excellent" ;
        }else if(this.fuel >= 15.0){
            this.remark = "good" ;
        }else{
            this.remark = "poor" ;
        }
    }

    public double getFuel() {
        return fuel;
    }
}
