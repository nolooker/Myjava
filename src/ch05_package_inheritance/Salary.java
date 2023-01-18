package ch05_package_inheritance;

public class Salary {
    public static String ceoname = "강감찬" ;

    private String name ; // 이름
    private int salary ; // 급여
    private String department ; // 부서명

    public Salary(String name, int salary, String department) {
        this.name = name ;
        this.salary = salary ;
        this.department = department ;
    }

    public Salary(String name, String department) {
        this.name = name ;
        this.salary = 3000 ;
        this.department = department ;
    }

    public void Display() {
        int bae = 0 ;
        boolean condition = this.department.equals("영업") || this.department.equals("판매")  ;
        if (condition){
            bae = 15 ;
        }else{
            bae = 12 ;
        }
        String imsi = "";
        imsi += this.name + "(" + this.department + ")" ;
        imsi += ", 급여 : " + this.salary  ;
        imsi += ", 년봉 : " + (bae * this.salary) ;

        System.out.println(imsi);
    }
}
