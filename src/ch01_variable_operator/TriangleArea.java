package ch01_variable_operator;

public class TriangleArea {
    public static void main(String[] args) {
        float width ; // 밑변
        float height ; // 높이
        float area ; // 면적

        width = 7.5f;
        height = 2.5f;
        area = width * height / 2.0f ;

        String result = "밑변 : " + width + ", 높이 : " + height ;
        result = result + "\n면적 : " + area ;
        System.out.println(result);
    }
}
