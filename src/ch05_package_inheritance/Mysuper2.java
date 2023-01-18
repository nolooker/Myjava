package ch05_package_inheritance;

public class Mysuper2 {
    private String name ;
    public Mysuper2() {
        System.out.println("A");
    }

    public Mysuper2(String name){
        System.out.println("C");
        this.name = name ;
    }
}
