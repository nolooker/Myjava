package ch04_class;

// step01) 클래스 정의(선언)
// 기존 데이터를 여러 개 묶어서 만드는 사용자 정의 데이터 타입
// 새로운 물건을 만들어 내기 위한 template
public class Saram01 {
    // 클래스의 구성 요소 각각을 member라고 부릅니다.
    String nationality ;
    String name ;
    double height ;
    double weight ;
    String hobby ;
    String blood ;

    // 주민 번호 뒤 1자리가 들어오면, 해당 이름과 성별에 대한 정보를 반환해 줍니다.
    String showGenderInfo(int juminno){
        String gender = "" ;

        if(juminno == 1 || juminno == 3){
            gender = "남자" ;
        }else{
            gender = "여자" ;
        }

        String result = name + "님은 " + gender + "이군요.";
        return result;
    }

    // 멤버 변수들의 값 출력하기
    // void) 메소드가 반환 하지 않을 때 사용하는 키워드
    // return 구문도 필요 없음
    void Display(){
        System.out.println(name + "님의 신상 정보");
        System.out.println("국적 : " + nationality);
        System.out.println("이름 : " + name + "님");
        System.out.println("키 : " + height + "cm");
    }

    String showBmiInfo(){
        double newHeight = height / 100.0 ; // 센티미터를 미터로 변환.
        double rate = weight / (newHeight * newHeight) ;
        String bmi = "" ;

        if(rate >= 25.00){
            bmi = "비만" ;
        }else if(rate >= 23.00){
            bmi = "과체중" ;
        }else if(rate >= 18.50){
            bmi = "정상" ;
        }else{
            bmi = "저체중" ;
        }

        String result = name + "님은 " + bmi + "입니다." ;

        return result  ;
    }
}