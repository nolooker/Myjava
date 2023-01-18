package ch05_package_inheritance;

public class EmpSalary02 {
    public static void main(String[] args) {

        System.out.println("대표 이사 이름 : " +Employee02.ceoname);

        Employee02 hong = new Employee02("홍길동",10000,"영업") ;
        hong.Display() ;

        Employee02 hee = new Employee02("박영희",30000,"구매") ;
        hee.Display() ;

        Employee02 soo = new Employee02("김철수","광고") ;
        soo.Display() ;


    }
}
