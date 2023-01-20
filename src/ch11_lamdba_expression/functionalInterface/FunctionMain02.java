package ch11_lamdba_expression.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class FunctionMain02 {
    public static void main(String[] args) {
        List<Saram> list = Arrays.asList(
                new Saram("11", "조성모", 27, 22),
                new Saram("13", "성시경", 37, 26),
                new Saram("14", "이승철", 36, 81),
                new Saram("15", "이수영", 37, 29)
        );


        //매핑 : Saram - 수학점수
        ToIntFunction<Saram> toIntFunction_math = student -> student.getKor();
        //매핑 : Saram - 영어점수
        ToIntFunction<Saram> toIntFunction_english = student -> student.getEng();


        System.out.println("--국어 점수 가져오기");
        for(Saram stu : list){
            int math = getScore(toIntFunction_math, stu);
            System.out.print(math+ " ");
        }

        System.out.println("\n--영어 점수 가져오기");
        for(Saram stu : list){
            int english = getScore(toIntFunction_english, stu);
            System.out.print(english+ " ");
        }
    }

    //메소드 : function에 해당하는 과목 점수를 반환하기
    public static int getScore(ToIntFunction toIntFunction, Saram student){
        int score = toIntFunction.applyAsInt(student);
        return score;
    }
}
