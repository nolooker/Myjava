package ch10_collection;

// JavaBean 클래스 : 데이터 1개를 표현하기 위한 자바 클래스
// 만들어진 객체를 bean객체 라고 부릅니다.
public class Hakseng {
    private String name ;
    private int grade ;
    private int ban ;
    private int kor ;
    private int eng;
    private int math ;

    // 생성자, getter, setter 구비
    public Hakseng() {    }

    public Hakseng(String name, int grade, int ban, int kor, int eng, int math) {
        this.name = name;
        this.grade = grade;
        this.ban = ban;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getBan() {
        return ban;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }
}
