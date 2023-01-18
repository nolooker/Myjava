package ch04_class;

public class StaticTest {
    // main 메소드는 static 메소드입니다.
    public static void main(String[] args) {
        System.out.println(Mathematics.first);

        Mathematics math = new Mathematics() ;
        System.out.println(math.second);

        int x = 3, y = 5 ;
        int result = Mathematics.max(x, y) ;
        System.out.println("최대 값 : " + result );

        result = math.min(x, y) ;
        System.out.println("최소 값 : " + result );

        result = abs(-12) ;
        System.out.println("절대 값 : " + result );

        StaticTest st = new StaticTest() ;
        st.sayHello("김철수");
    }
    public void sayHello(String name){
        System.out.println(name + "님 안녕하세요.^^");
    }

    public static int abs(int x){
        if(x <0){x =-x ;}
        return x ;
    }
}
