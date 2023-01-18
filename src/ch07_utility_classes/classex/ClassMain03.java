package ch07_utility_classes.classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMain03 {

	public static void main(String[] args) throws ClassNotFoundException {

		String className = "ch07_utility_classes.classex.Human";
		Class myClass = Class.forName(className);
		
		Constructor[] arrConstruct = myClass.getConstructors();
		System.out.println("show all constructor information");
		for(Constructor cost : arrConstruct){
			System.out.println(cost);
		}
		System.out.println();
		Field[] fields = myClass.getFields();
		System.out.println("show all fields information");
		for(Field f : fields){
			System.out.println(f);
		}
		System.out.println();
		Method[] methods = myClass.getMethods();
		System.out.println("show all methods information");
		for(Method m : methods){
			System.out.println(m);
		}
	}
}
