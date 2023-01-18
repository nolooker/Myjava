package ch07_utility_classes.classex;

public class ClassMain02 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		Human class01 = new Human();
		System.out.println(class01);

		String className = "ch07_utility_classes.classex.Human";
		Class pClass = Class.forName(className);

		Human class02 = (Human)pClass.newInstance();
		System.out.println(class02);
	}
}
