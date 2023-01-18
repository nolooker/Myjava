package ch07_utility_classes.classex;

public class Human {
	private String name;
	private String address;
	private int age;

	public String gender ;

	public Human(){}
	
	public Human(String name){
		this.name = name;
	}
	
	public Human(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
