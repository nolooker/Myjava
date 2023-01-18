package ch06_abstract_interface.myshape;

public abstract class Shape { // 추상 클래스
    // 모든 도형들은 선과 채우기 색상을 가지므로 일반화 된 변수로 볼수 있습니다.
    private String linecolor ; // 도형 선 색상
    private String fillcolor ; // 도형 채우기 색상
    protected double area ; // 면적

    // 추상 메소드
    public abstract double calcArea();
    public abstract void Display();

    public Shape() {
    }

    public Shape(String linecolor, String fillcolor) {
        this.linecolor = linecolor ;
        this.fillcolor = fillcolor ;
    }
    public final void draw(){
        System.out.println("라인 색상 : " + this.linecolor);
        System.out.println("채우기 색상 : " + this.fillcolor);
    }
}
