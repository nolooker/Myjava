package ch05_package_inheritance;

public class InheTest {
    public static void main(String[] args) {
        Mysub sub = new Mysub() ;
        System.out.println(sub.getClass());
        sub.y = 500; // 해당 객체의 멤버 변수이므로 접근이 가능합니다.
        System.out.println("sub.y = " + sub.y);

        sub.x = 700 ; // 상속을 받은 슈퍼 클래스 변수에 접근 가능합니다.
        System.out.println("sub.x = " + sub.x);

        // private 변수는 상속이 되지 않습니다.
        //sub.hello = "xxx";
        sub.sayHello("김철수");
    }
}
