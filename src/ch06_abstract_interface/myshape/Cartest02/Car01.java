package ch06_abstract_interface.myshape.Cartest02;

public abstract class Car01 implements Speed01,Display01 {

    private String name ;     //4
    int price ;       //5


    public String getName() {    //13
        return name;
    }


    @Override    //15
    public String toString() {

        String imsi = "이름 : " +this.name + "\n" ;
        imsi += "단가 : " +this.price +"\n" ;
        return imsi ;
    }


    // (11
    // 모든 차에는 속도 개념이 있으므로 super에서 작성
    private int speed ;  // 차량 현재 속도

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed += speed;
        if(this.speed >= 50) {
            System.out.println("50이상 과속하지 마세요.");
            this.speed = 50 ;
        }
    }


    // 11)
    public Car01(String name, int price) {  //9

        this.name = name ;
        this.price = price ;

    }

}
