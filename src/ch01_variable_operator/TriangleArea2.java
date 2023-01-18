package ch01_variable_operator;

public class TriangleArea2 {
    public static void main(String[] args) {

        float width ;
        float height ;
        float area ;

        width = 7.5f ;
        height = 2.5f ;
        area = width * height / 2.0f;

        String result = "밑변 : " +width + "높이 :" +height ;
        result = result + "\n\n면적 :" +area ;
        System.out.println(result);
    }
}
