package ch06_abstract_interface.abstractex;

public abstract class Computer {
    public abstract void Display() ;
    public abstract void Typing() ;

    public void turnOn(){
        System.out.println("전원 켜기");
    }
    public void turnOff(){
        System.out.println("전원 끄기");
    }
}
