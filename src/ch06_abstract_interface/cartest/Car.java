package ch06_abstract_interface.cartest;

public abstract class Car implements Speed, Display  {
    private String name ; // 이름
    private int price ; // 단가

    public Car() {
    }

    @Override
    public String toString() {
        String imsi = "이름 : " + this.name + "\n" ;
        imsi +=  "단가 : " + this.price + "원" ;
        return imsi ;
    }

    public String getName() {
        return name;
    }

    // 모든 차에는 속도 개념이 있으므로 super에서 작성했습니다.
    private int speed ; // 차량 현재 속도

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed += speed;
        if(this.speed >= Speed.ALLOWED_MAX_SPEED){
            System.out.println(Speed.ALLOWED_MAX_SPEED + "이상 과속하지 마세요.");
            this.speed = Speed.ALLOWED_MAX_SPEED ;
        }
    }

    public Car(String name, int price) {
        this.name = name ;
        this.price = price ;
    }
}
