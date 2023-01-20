package ch11_lamdba_expression.functionalInterface.streamtest;

public class Customer {
	private String name;   //이름
	private int age;       //나이
	private String gender ; // 성별

	public Customer(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String toString() {
		return "name : " + name + ", age : " + age + ", gender : " + gender;
	}
}