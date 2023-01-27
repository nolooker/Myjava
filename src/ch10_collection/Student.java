package ch10_collection;

// Comparable 인터페이스는 객체들의 특정 컬럼을 비교하기 위하여 제공됩니다.
// 추상 메소드 compareTo()를 오버라이딩하여 구현하여야 합니다.
import org.jetbrains.annotations.NotNull;

public class Student implements Comparable<Student>{
    private int number; // 학번
    private String name ; // 이름

    @Override
    public int compareTo(@NotNull Student target) {
        // 비교 결과를 +1, 0, -1의 형태로 반환해 줍니다.
        return Integer.compare(this.number, target.number);
    }

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "(" + number + ")" ;
    }
}
