package ch05_package_inheritance;

import mypackage.*; // *은 all classes의 의미

import java.util.Scanner;

public class MyPackTest {
    public static void main(String[] args) {
        MyPackOne obj1 = new MyPackOne();
        obj1.setData(1234);
        System.out.println(obj1.getData());
        obj1.one();

        MyPackTwo two = new MyPackTwo() ;
        two.two();

        Scanner scan = new Scanner(System.in) ;
    }
}
