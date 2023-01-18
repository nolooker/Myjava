package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    private static List<Student> list = Arrays.asList(
        new Student("김철수", 50, 60, 70),
        new Student("박영희", 35, 45, 55)
    );

    public static void main(String[] args) {
        System.out.println("학생 이름");
        //printString(t -> t.getName());

        System.out.println("국어 점수");
        //printString(t -> t.getKor());
    }

    private static void printString(Function<Student, Student> function) {
        for(Student student : list){
            System.out.println(function.apply(student) + " ");
        }
        System.out.println();
    }
}
