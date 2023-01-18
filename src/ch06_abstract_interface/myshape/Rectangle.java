package ch06_abstract_interface.myshape;

public class Rectangle extends Shape{
    private double width ; // 밑변
    private double height ; // 높이

    public Rectangle(double width, double height, String linecolor, String fillcolor) {
        super(linecolor, fillcolor);
        this.width = width;
        this.height = height;

        // 생성자의 마지막에서 면적을 구해 줍니다.
        super.area = this.calcArea() ;
    }

    @Override // 구현된 메소드
    public double calcArea() {
        return this.width * this.height;
    }

    public void Display() {
        // 면적 출력과 그리기 동작을 구현
        System.out.println("사각형 면적 : " + super.area);
        super.draw();
    }
}
