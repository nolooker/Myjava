package ch06_abstract_interface.templatemethod02;

public abstract class Animal {
    public abstract void run();
    public abstract void jump();
    public abstract void fly();
    public abstract void showInfo();

    final public void execute(int count){
        run();
        for (int i = 0; i < count ; i++) {
            jump();
        }
        fly();
    }
}
