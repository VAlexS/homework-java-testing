package clases;

import java.util.UUID;

public class Course {

    private final String courseId;

    private String name;

    private double price;

    private double money_earned;

    private Teacher teacher;


    public Course(String name, double price) {
        this.courseId = UUID.randomUUID().toString();
        setName(name);
        setPrice(price);
        this.money_earned = 0; //inicialmente no ha habido gastos
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getCourseId() {
        return this.courseId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if (price < 0)
            throw new IllegalArgumentException("El precio no puede ser negativo");
        this.price = price;
    }

    public double getMoney_earned() {
        return this.money_earned;
    }

    public void setMoney_earned(double money_earned) {
        if (money_earned < 0)
            throw new IllegalArgumentException("La cantidad de dinero no puede ser negativa");
        this.money_earned = money_earned;
    }



    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + this.courseId + '\'' +
                ", name='" + this.name + '\'' +
                ", price=" + this.price +
                ", money_earned=" + this.money_earned +
                ", teacher=" + this.teacher +
                '}';
    }


}
