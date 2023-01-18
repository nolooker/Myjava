package ch05_package_inheritance;

public class Mysub02 extends Mysuper02 {


    public Mysub02() {

        // 상속 관계의 생성자의 첫 줄에는 super() 이 숨어 있다.
        // super()는 매개 변수가 없는 부모의 생성자를 의미
        super();
        System.out.println("B");

    }

    public Mysub02 (String name) {

        //개발자가 super() 대신에 직접 구현하게 되면 super()는 사라짐.

        super(name);
        //변수 접근이 가능하면 super 키워드를 이용하여 접근

//        super.name = name ;
        System.out.println("D");
    }
}
