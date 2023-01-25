package ch07_utility_classes.classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMain03 {
    public static void main(String[] args) throws ClassNotFoundException {

        String className = "ch07_utility_classes.classex.Human";
        Class myClass = Class.forName(className);

        System.out.println("모든 생성자 정보");

        Constructor[] arrConstruct = myClass.getConstructors();
        System.out.println("show all constructor information");

        for (Constructor cost : arrConstruct) {
            System.out.println(cost);
        }

        System.out.println();
        System.out.println("모든 필드 정보");

        Field[] fields = myClass.getFields();
        System.out.println("show all fields information");

        for (Field f : fields) {
            System.out.println(f);
        }

        System.out.println();
        System.out.println("모든 메소드 정보");

        Method[] methods = myClass.getMethods();
        System.out.println("show all methods information");

        for (Method m : methods) {
            System.out.println(m);
        }
    }
}
