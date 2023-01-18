package ch06_abstract_interface.myshape.Cartest;

public abstract class Car implements Speed,Display {


    String name;
    int price;
    int speed ; // 속도

    public Car(String name, int price) {

        this.name = name ;
        this.price = price ;


        for (int i = 0; i < su; i++) {
            int su = speed + 10 ;

        }
        if ( speed >= 22 ) {
            this.speed += Tico.su ;
            int su = 22 ;
            System.out.println("티코의 현재속도 : " +this.speed + "//엑셀 밟기");

        }else if (speed > 52 ){
            this.speed += Tico.su ;
            int su = 52 ;

            System.out.println("티코의 현재속도 : " +this.speed + "//엑셀 밟기");

        }else {
            this.speed += Tico.su ;
            int su = 38 ;
            System.out.println("티코의 현재속도 : " +this.speed + "브레이크 밟기");
        }

        System.out.println("티코의 현재속도 : " +speed);
        System.out.println("티코의 속도 : " +su);
    }


    public void Display() {

        String imsi = "%s의 초기 속도는 %d 입니다.\n" ;
        System.out.printf(imsi, this.name, this.speed);

        this.run();

    }

    @Override
    public void run() {

        String imsi = "%s은(는) 최대 %d의 속도로 달릴 수 있습니다.\n" ;
        System.out.printf(imsi, this.name, this.speed);

    }

    @Override
    public String display() {
        return null;
    }


}
