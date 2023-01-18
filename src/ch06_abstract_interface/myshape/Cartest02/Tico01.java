package ch06_abstract_interface.myshape.Cartest02;

public class Tico01 extends Car01 {  //7

    private String comment ;

    @Override    //15
    public String toString() {

        String imsi = "이름 : " + this.getName() + "\n" ;
        imsi += "단가 : " +this.price +"\n" ;
        return imsi ;
    }

    public Tico01(String name, int price, String comment) {
        super(name,price);
        this.comment = comment ;
    }


    // 6 오버라이딩 ㄱㄱ ㄱ

    @Override
    public void display() {
        String imsi = " %s의 현재 속도는 %dkm 입니다.\n" ;     //14

        System.out.printf(imsi,getName(),getSpeed());       //14
        super.getSpeed() ;                                  //14

    }

    @Override
    public void speedup(int su) {
        super.setSpeed(+su) ;  //12

    }

    @Override
    public void speeddown(int su) {
        super.setSpeed(-su);  //12

    }
}
