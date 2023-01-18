package ch05_package_inheritance;

public class EmpSalary {
    public static void main(String[] args) {
        System.out.println("대표 이사 이름 : " + Salary.ceoname);

        //영업 부서의 연봉은 15배로 책정됩니다.
        //이름, 급여, 부서명
        Employee hong = new Employee("홍길동", 10000, "영업") ;
        hong.Display();

        //구매 부서의 연봉은 12배로 책정책정됩니다.
        Employee hee = new Employee("박영희", 10000, "구매") ;
        hee.Display();

        //급여 미입력(이름, 부서)시 기본 값으로 3000원이 대입되어야 합니다.
        Employee soo = new Employee("김철수", "광고") ;
        soo.Display();
    }
}
