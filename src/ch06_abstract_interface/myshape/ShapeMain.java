package ch06_abstract_interface.myshape;

public class ShapeMain {
    public static void main(String[] args) {
        Shape[] shape = {
            new Rectangle(20.0, 10.0, "red", "green"),
            new Triangle(15.0, 10.0, "yellow", "black"),
            new Circle(5.0, 3.0, 4.0, "pink", "blue")
        };

        for(int i = 0 ; i < shape.length ; i++){
            System.out.println();
            shape[i].Display();
        }

        //Shape is abstract; cannot be instantiated
        // 추상 클래스는 불완전 클래스이므로, 객체 생성을 할 수 없습니다.
        // 대신, 하위 클래스(Circle, Rectangle 등등)를 이용하여 객체 생성을 합니다.
        // 하위 클래스를 구현체 클래스라고 부릅니다.
        //Shape sample01 = new Shape();

        Shape sample = new Shape() {
            @Override
            public double calcArea() {
                return 0;
            }

            @Override
            public void Display() {
                System.out.println("Anonymous Inner Type");
            }
        };
        for (int i = 0; i < 3; i++) {
            sample.Display();
        }

        new Shape() {
            @Override
            public double calcArea() {
                return 0;
            }

            @Override
            public void Display() {
                System.out.println("일회용 객체 만들기");
            }
        }.Display();


    }
}
