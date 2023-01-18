package ch05_package_inheritance.shoestype;

// 한글도 동시에 표현하기
public enum ShoesTypeName {
    WALKING("워킹화"), RUNNING("런닝화"), TRACKING("트래킹화"), HIKING("등산화");

    private String name ;

    private ShoesTypeName(String name) {
        this.name = name ;
    }

    public String getName() {
        return name;
    }
}
