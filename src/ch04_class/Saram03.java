package ch04_class;

public class Saram03 {
    private String name ; // 1번
    private double height ;
    private double weight ;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setName(String name){ // 2번
        this.name = name + "님" ;
    }

    public String getName(){
        return "고객 " + name ;
    }

    public void setHeight(double height){
        this.height = height ;
    }

    public double getHeight(){
        return height ;
    }

}
