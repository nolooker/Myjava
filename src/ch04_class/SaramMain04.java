package ch04_class;

public class SaramMain04 {
    public static void main(String[] args) {
        // 클래스이름    객체이름  =  new    생성자이름();
        Saram04 yusin = new Saram04();
        yusin.Display();

        Saram04 soon = new Saram04("유관순", 162.5, 50.0, "운동", "B");
        soon.Display();

        // 다음과 같이 박영희를 위한 생성자를 구현하세요.
        // 단, 취미는 미입력시 "퀼트"로 처리해주세요.
        Saram04 hee = new Saram04("박영희", 158.5, 50.0, "O");
        hee.Display();
    }
}
