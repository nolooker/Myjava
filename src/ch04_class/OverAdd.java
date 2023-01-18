package ch04_class;

public class OverAdd {
    public void Add(int x, int y){
        System.out.println("정수형 x + y = " + (x+y));
    }

    public void Add(double x, double y){
        System.out.println("실수형 x + y = " + (x+y));
    }

    public void Add(int x, double y){
        System.out.println("혼합형 x + y = " + (x+y));
    }

    public int Add(int x, int y, int z){
        return x + y + z ;
    }
}
