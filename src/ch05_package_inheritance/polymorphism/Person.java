package ch05_package_inheritance.polymorphism;

public class Person {
    private String name ;
    private Car car ;

    double tax = 0.0 ; // 세금

    public Person(String name) {
        this.name = name;
    }

    public void ride(Car car) {
        this.car = car ;
        System.out.println("차주 : " + this.name);
		int price = this.car.getPrice() ;
        System.out.println("가격 : " + price + "원");
        System.out.println("차량 : " + this.car.getName() + " 시승");

        if(car instanceof Avante){
            Avante myavante = (Avante)car ; // 강등
            System.out.println("코멘트 : " + myavante.getComment());

        }else if(car instanceof Sonata){
            Sonata mysonata = (Sonata)car ;
            System.out.println("메이커 : " + mysonata.getMaker());

        }else if(car instanceof Grandeur){
            Grandeur mycube = (Grandeur)car ;
            System.out.println("연비 : " + mycube.getFuel());
            System.out.println("연비 멘트 : " + mycube.getRemark() );
        }

        this.calcTax(price) ;
        System.out.println("세금 : " + this.tax + "원");
    }

    private void calcTax(int price) {
        // 가격이 150이상이면 10%의 세금을 미만이면 5%의 세금을 부여해 봅시다.
        this.tax = price >= 150 ? 0.10 * price  : 0.05 * price ;
    }
}
