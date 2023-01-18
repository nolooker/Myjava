package ch06_abstract_interface.templatemethod02;

public class Rabbit extends Animal {
    @Override
    public void run() {
        System.out.println("깡총 깡총 달립니다.");
    }
    @Override
    public void jump() {
        System.out.println("점프는 못합니다.");
    }
    @Override
    public void fly() {
        System.out.println("날지도 못합니다.");
    }
    @Override
    public void showInfo() {
        System.out.println("애완용 토끼.");
    }
}
