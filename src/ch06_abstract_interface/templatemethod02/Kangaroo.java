package ch06_abstract_interface.templatemethod02;

public class Kangaroo extends Animal {
    @Override
    public void run() {
        System.out.println("성큼 성큼 달립니다.");
    }
    @Override
    public void jump() {
        System.out.println("높이 점프 가능해요.");
    }
    @Override
    public void fly() {
        System.out.println("덩치가 커서 날지 못합니다.");
    }
    @Override
    public void showInfo() {
        System.out.println("호주에 사는 캥거루.");
    }
}
