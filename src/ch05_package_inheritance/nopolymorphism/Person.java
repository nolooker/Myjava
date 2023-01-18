package ch05_package_inheritance.nopolymorphism;

public class Person {
    private String name ;
    private Avante avante ;
    private Sonata sonata ;
    private Grandeur grandeur = null ;

    double tax = 0.0 ; // 세금

    public Person(String name) {
        this.name = name;
    }

    public void ride(Avante avante) {
        this.avante = avante ;
        System.out.println("차주 : " + this.name);
        System.out.println("가격 : " + this.avante.getPrice() + "원");
        System.out.println("차량 : " + this.avante.getName() + " 시승");
        System.out.println("코멘트 : " + this.avante.getComment());

        this.calcTax(this.avante.getPrice()) ;
        System.out.println("세금 : " + this.tax + "원");
    }

    private void calcTax(int price) {
        // 가격이 150이상이면 10%의 세금을 미만이면 5%의 세금을 부여해 봅시다.
        this.tax = price >= 150 ? 0.10 * price  : 0.05 * price ;
    }

    public void ride(Sonata sonata) {
        this.sonata = sonata ;
        System.out.println("차주 : " + this.name);
        System.out.println("가격 : " + this.sonata.getPrice() + "원");
        System.out.println("차량 : " + this.sonata.getName() + " 시승");
        System.out.println("메이커 : " + this.sonata.getMaker());

        this.calcTax(this.sonata.getPrice()) ;
        System.out.println("세금 : " + this.tax + "원");
    }

    public void ride(Grandeur grandeur){
        this.grandeur = grandeur ;

        System.out.println("차주 : " + this.name);
        System.out.println("가격 : " + this.grandeur.getPrice());
        System.out.println("차량 : " + this.grandeur.getName() + " 시승");
        System.out.println("연비 : " + this.grandeur.getFuel());

        this.calcTax(this.grandeur.getPrice()) ;
        System.out.println("세금 : " + this.tax + "원");
        System.out.println("연비 멘트 : " + this.grandeur.getRemark() + "원");
    }
}
