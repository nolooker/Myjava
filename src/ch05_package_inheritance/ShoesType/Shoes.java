package ch05_package_inheritance.shoestype;

public class Shoes {
    private String name ; // 신발 이름
    private int size ; // 사이즈
    private ShoesType shoesType ; // 신발의 유형
    private ShoesTypeName shoesTypeName ; // 한글 이름도 포함하고 있는 Enum 타입

    public Shoes(String name, int size, ShoesTypeName shoesTypeName){
        this.name = name ;
        this.size = size ;
        this.shoesTypeName = shoesTypeName ;
    }

    public Shoes(String name, int size, ShoesType shoesType) {
        this.name = name ;
        this.size = size ;
        this.shoesType = shoesType ;
    }

    public void Display() {
        System.out.println("신발 이름 : " + this.name);
        System.out.println("신발 크기 : " + this.size + "mm");
        System.out.println("신발 코드 : " + this.shoesType);
    }

    public void Display02() {
        System.out.println("신발 이름 : " + this.name);
        System.out.println("신발 크기 : " + this.size + "mm");
        System.out.println("신발 코드 : " + this.shoesTypeName);
        System.out.println("한글 이름 : " + this.shoesTypeName.getName());
    }
}
