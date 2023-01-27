package ch10_collection;

import org.jetbrains.annotations.NotNull;

public class Student2 implements Comparable<Student2>{
    private String name ; // 이름
    private int ban; // 반
    private int number; // 번호

    @Override
    public int compareTo(@NotNull Student2 target) {
        int result = Integer.compare(this.ban, target.ban) ;

        if(result == 0){ // 나랑 걔랑 같은 반입니다.
            return Integer.compare(this.number, target.number);

        }else{ // 다른 반이므로 순서가 결정됩니다.
            return result; // +1 또는 -1
        }
    }

    public Student2(String name, int ban, int number) {
        this.name = name;
        this.ban = ban;
        this.number = number;
    }

    @Override
    public String toString() {
        return name + "(" + ban + "반 " + number + "번)" ;
    }

}
