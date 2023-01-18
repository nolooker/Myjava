package ch06_abstract_interface.abstractex;

public class Desktop extends Computer{
    @Override
    public void Display() {
        System.out.println("desktop display");
    }

    @Override
    public void Typing() {
        System.out.println("desktop typing");
    }
}
