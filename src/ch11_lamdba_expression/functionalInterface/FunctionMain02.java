package ch11_lamdba_expression.functionalInterface;

import ch11_lamdba_expression.model.Saram;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class FunctionMain02 {
    public static void main(String[] args) {
        List<Saram> list = Arrays.asList(
            new Saram("yusin", "김유신" , 40,50, 60),
            new Saram("lee", "이순신" , 50,50, 50),
            new Saram("nongae", "논개" , 30,40, 90),
            new Saram("kim9", "김구" , 70,20, 30)
        );

        System.out.println("객체 Saram 타입을 int 타입으로 반환해 줍니다.");
        ToIntFunction<Saram> getKorJumsu = saram -> saram.getKor() ;
        ToIntFunction<Saram> getEngJumsu = saram -> saram.getEng() ;
        ToIntFunction<Saram> getMathJumsu = saram -> saram.getMath() ;

        System.out.println("메소드의 매개 변수 형식으로 전달이 가능합니다.");
        System.out.println("시험 점수 가져 오기");
        for(Saram bean : list){
            int kor = getScore(getKorJumsu, bean);
            int eng = getScore(getEngJumsu, bean);
            int math = getScore(getMathJumsu, bean);
            String message = "국어 : %d, 영어 : %d, 수학 : %d\n" ;
            System.out.printf(message, kor, eng, math);
        }

        System.out.println();
        System.out.println("객체 Saram 타입을 double 타입으로 반환해 줍니다.");
        System.out.println("3과목의 평균을 구해 줍니다.");
        ToDoubleFunction<Saram> average = saram -> (double)(saram.getKor()+saram.getEng()+saram.getMath())/3.0;

        printAverage(average, list);
    }

    // 각각의 평균 점수를 구하고, 점수에 대한 총 평균 값을 구합니다.
    private static void printAverage(ToDoubleFunction<Saram> abcd, List<Saram> defg) {
        double sum = 0.0 ;
        for(Saram bean : defg){
            double score = abcd.applyAsDouble(bean);
            sum += score ;
            String message = "%s의 평균 점수 : %.3f\n" ;
            System.out.printf(message, bean.getName(), score);
        }
        double sumTotal = sum / defg.size() ;
        String message = "\n점수 총 평균 : %.3f\n" ;
        System.out.printf(message, sumTotal);
    }

    // 해당 과목에 대한 점수를 반환해 줍니다.
    public static int getScore(ToIntFunction<Saram> asdf, Saram qwert){
        int score = asdf.applyAsInt(qwert);
        return score ;
    }
}
