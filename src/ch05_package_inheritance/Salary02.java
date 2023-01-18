package ch05_package_inheritance;

public class Salary02 {

    public static String ceoname = "강감찬" ;

    private String name ;
    private int salary ;
    private String department ;

    public Salary02 (String name, int salary, String department) {
        this.name = name ;
        this.salary = salary ;
        this.department = department ;

    }

    public Salary02 (String name, String department) {
        this.name = name ;
        this.salary = 3000 ;
        this.department = department ;

    }

    public void Display() {
        int bat = 0 ;
        boolean condition = this.department.equals("영업") || this.department.equals("구매") ;
        if (condition) {
            bat = 15 ;
        }else{
            bat = 12 ;
        }

        String imsi = "" ;

        imsi += this.name + "("+this.department +")";
        imsi += ", 급여 : " +this.salary ;
        imsi += ", 연봉 : " +(bat*this.salary);

        System.out.println(imsi);

    }

}
