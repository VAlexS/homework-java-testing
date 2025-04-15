package clases;

import java.util.UUID;

public class Teacher {
    private final String teacherId;
    private String name;
    private double salary;

    public Teacher(String name, double salary) {
        this.teacherId = UUID.randomUUID().toString();
        setName(name);
        setSalary(salary);
    }

    public String getTeacherId() {
        return this.teacherId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
