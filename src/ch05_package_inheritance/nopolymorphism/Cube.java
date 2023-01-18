package ch05_package_inheritance.nopolymorphism;

public class Cube {
    private String name ;
    private int price ;
    private double fuel ; // 연비
    private String remark ; // 연비에 대한 메모

    public String getRemark() {
        return remark;
    }

    public Cube(String name, int price, double fuel) {
        this.name = name;
        this.price = price;
        this.fuel = fuel;

        if(this.fuel >= 20.0){
            this.remark = "excellent" ;
        }else if(this.fuel >= 15.0){
            this.remark = "good" ;
        }else{
            this.remark = "poor" ;
        }
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double getFuel() {
        return fuel;
    }
}
