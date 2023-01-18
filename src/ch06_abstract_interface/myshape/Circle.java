package ch06_abstract_interface.myshape;

public class Circle extends Shape {
    private double radius ; // 반지름
    private double xpos ; // x 좌표
    private double ypos ; // y 좌표

    public Circle(double radius, double xpos, double ypos, String linecolor, String fillcolor) {
        super(linecolor, fillcolor);
        this.radius = radius;
        this.xpos = xpos;
        this.ypos = ypos;

        super.area = this.calcArea() ;
    }

    @Override
    public double calcArea() {
        return Math.PI * this.radius * this.radius ;
    }

    public void Display() {
        // 면적 출력과 그리기 동작을 구현
        System.out.printf("원 면적 : %.3f\n", super.area);
        System.out.println("원 중심 : (" + xpos + ", " + ypos + ")");
        super.draw();
    }
}
