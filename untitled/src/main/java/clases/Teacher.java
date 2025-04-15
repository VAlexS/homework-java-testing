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
        if (salary < 0)
            throw new IllegalArgumentException("El sueldo no puede ser negativo");
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + this.teacherId + '\'' +
                ", name='" + this.name + '\'' +
                ", salary=" + this.salary +
                '}';
    }
}
