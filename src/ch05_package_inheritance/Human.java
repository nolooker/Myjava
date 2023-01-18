package ch05_package_inheritance;

public class Human {
    private String name ;
    private String gender ;
    private double height ;
    private double weight ;

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    private void output1(){
        String message = "이름 : %s, 성별 : %s, 키 : %.1f, 몸무게 : %.2f\n" ;
        System.out.printf(message, this.name, gender, height, weight);
    }

    public Human(String name, String gender, double height, double weight) {
        this.name = name ;
        if(gender == "M"){
            this.gender = "남자" ;
        }else{
            this.gender = "여자" ;
        }

        this.height = height ;
        this.weight = weight ;
        this.output1();
    }
}
