package ch05_package_inheritance;

// 메소드 은닉화란, 오버라이딩시 본의 아니게 부모의 메소드를 접근하지 못하는 현상을 의미합니다.

public class Sample {
    private String name ;
    private int age ;

    public Sample() {
    }
    public Sample(String name, int age) {
        this.name = name ;
        this.age = age ;
    }
    // 골뱅이로 시작하는 모든 항목들을 어노테이션이라고 부릅니다.
    @Override // 이 메소드는 오버라이딩되었습니다.
    public String toString() {
        String imsi = "이름 : " + this.name ;
        imsi += ", 나이 : " + this.age ;
        return imsi ;
    }
}
