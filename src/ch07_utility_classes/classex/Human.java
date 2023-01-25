package ch07_utility_classes.classex;

public class Human {
    private String name;
    private String address;
    private int age;

    public String gender;

    public Human() {

    }

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, String address, int age) {
        this.name = name;
        this.address = address;
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

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public String getGender() {

        return gender;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

    @Override
    public String toString() {

        String imsi = "";
        imsi += "이름 : " + this.name;
        imsi += ", 주소 : " + this.address;
        imsi += ", 나이 : " + this.age;
        return imsi;

    }
}
