package ch06_abstract_interface.abstractex;

public class ComputerMain {
    public static void main(String[] args) {
        Computer[] com =
                {
                    new Desktop(),
                    new MyNotebook()
                } ;

        for (int i = 0; i < com.length; i++) {
            com[i].turnOn();
            com[i].Typing();
            com[i].Display();
            com[i].turnOff();
            System.out.println("=========");
        }
    }
}
