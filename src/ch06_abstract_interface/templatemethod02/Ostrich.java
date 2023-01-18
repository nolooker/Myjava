package ch06_abstract_interface.templatemethod02;

public class Ostrich extends Animal {
    @Override
    public void run() {
        System.out.println("무섭게 달려 옵니다.");
    }
    @Override
    public void jump() {
        System.out.println("점프는 거의 못하죠^^.");
    }
    @Override
    public void fly() {
        System.out.println("날 수 없습니다.");
    }
    @Override
    public void showInfo() {
        System.out.println("날지 못하는 타조.");
    }
}
