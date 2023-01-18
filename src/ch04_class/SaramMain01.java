package ch04_class;

public class SaramMain01 {
    public static void main(String[] args) {
        // step02) 객체 생성
        // 규칙) 생성자의 이름은 클래스의 이름과 동일해야 합니다.
        // 생성 문법
        // 클래스이름  객체이름 = new 생성자이름();
        Saram01 yusin =  new  Saram01();
        Saram01 soon ;
        soon = new Saram01() ;

        // step03) 멤버 변수에 값 할당(대입)_write
        // 멤버 변수는 dot(.) 연산자를 이용하여 접근합니다.
        // 객체이름.변수이름 = 값 ;
        yusin.nationality = "대한 민국" ;
        yusin.name = "김유신" ;
        yusin.height = 172.5 ;
        yusin.weight = 75.0 ;
        yusin.hobby = "당구" ;
        yusin.blood = "AB" ;

        // step04) 멤버 변수의 값 출력_read
        System.out.println("국적 : " + yusin.nationality);
        System.out.println("이름 : " + yusin.name);
        System.out.println("키 : " + yusin.height);
        System.out.println("몸무게 : " + yusin.weight);
        System.out.println("취미 : " + yusin.hobby);
        System.out.println("혈액형 : " + yusin.blood);

        soon.nationality = "대한 민국" ;
        soon.name = "유관순" ;
        soon.height = 168.5 ;
        soon.weight = 52.0 ;
        soon.hobby = "축구" ;
        soon.blood = "O" ;

        System.out.println("국적 : " + soon.nationality);
        System.out.println("이름 : " + soon.name);
        System.out.println("키 : " + soon.height);
        System.out.println("몸무게 : " + soon.weight);
        System.out.println("취미 : " + soon.hobby);
        System.out.println("혈액형 : " + soon.blood);


        System.out.println("메소드 호출 예시");
        // 주민 번호 뒤의 1자리를 입력하여 성별 정보를 다음과 같이 출력해 봅니다.
        // 예시) 김유신 님은 남자이군요.
        String message = yusin.showGenderInfo(3);
        System.out.println(message);
        yusin.Display();

        String result = yusin.showBmiInfo() ;
        System.out.println(result);

        int juminno = 2 ;
        message = soon.showGenderInfo(juminno);
        System.out.println(message);
        soon.Display();

        result = soon.showBmiInfo() ;
        System.out.println(result);

        // 타입[] 배열이름 = new 타입[요소개수];
        //int[] arr = new int[2] ;

        Saram01[] saram = new Saram01[2] ; // 배열 정의

        System.out.println("배열 요소들에 대한 객체 생성 및 값 할당");
        for (int i = 0; i < saram.length; i++) {
            saram[i] = new Saram01() ; // 객체 생성
            saram[i].name = "철수" + (i+1) ;
            saram[i].height = 160.0 + 10.0 * (i+1) ;
            saram[i].weight = 60.0 + 10.0 * (i+1) ;
        }

        System.out.println("배열 요소들 값 출력");
        for (int i = 0; i < saram.length; i++) {
            saram[i].Display();
        }
    }
}






