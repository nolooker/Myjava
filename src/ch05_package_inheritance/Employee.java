package ch05_package_inheritance;

public class Employee extends Salary {
    public Employee(String name, int salary, String department) {
        super(name, salary, department);
    }

    public Employee(String name, String department) {
        super(name, department);
    }
}
