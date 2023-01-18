package ch06_abstract_interface.myshape;

public class Triangle extends Shape{
    private double width ; // 밑변
    private double height ; // 높이

    public Triangle(double width, double height, String linecolor, String fillcolor) {
        super(linecolor, fillcolor);
        this.width = width;
        this.height = height;

        super.area = this.calcArea() ;
    }

    @Override
    public double calcArea() {
        return this.width * this.height / 2.0 ;
    }

    public void Display() {
        // 면적 출력과 그리기 동작을 구현
        System.out.println("삼각형 면적 : " + super.area);
        super.draw();
    }
}
