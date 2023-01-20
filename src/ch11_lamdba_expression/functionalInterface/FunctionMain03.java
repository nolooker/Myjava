package ch11_lamdba_expression.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToDoubleFunction;

public class FunctionMain03 {
    public static void main(String[] args) {
        List<Saram> list = Arrays.asList(
                new Saram("11", "조성모", 27, 22),
                new Saram("13", "성시경", 37, 26),
                new Saram("14", "이승철", 36, 81),
                new Saram("15", "이수영", 37, 29)
        );


        //매핑 : 수학, 영어 --> 평균점수
        ToDoubleFunction<Saram> toDoubleFunction =
                student -> (double)(student.getKor() + student.getEng())/2;
        //메소드에 값 넣기
        testT(toDoubleFunction, list);
    }

    static void testT(ToDoubleFunction function, List<Saram> list){
        double sum = 0;
        for(Saram stu : list){

            double score = function.applyAsDouble(stu);
            System.out.println(stu.getName()+ "의 평균 점수 : "+ score);
            sum += score;
        }
        double stuAverage = sum/list.size();
        System.out.println("점수 총 평균 : "+ stuAverage);
    }
}
