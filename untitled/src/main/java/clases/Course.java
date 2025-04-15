package clases;

import java.util.UUID;

public class Course {

    private final String courseId;

    private String name;

    private double price;

    private double money_earned;

    private Teacher teacher;


    public Course(String name, double price) {
        courseId = UUID.randomUUID().toString();
        setName(name);
        setPrice(price);
        money_earned = 0; //inicialmente no ha habido gastos
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0)
            throw new IllegalArgumentException("El precio no puede ser negativo");
        this.price = price;
    }

    public double getMoney_earned() {
        return money_earned;
    }

    public void setMoney_earned(double money_earned) {
        if (money_earned < 0)
            throw new IllegalArgumentException("La cantidad de dinero no puede ser negativa");
        this.money_earned = money_earned;
    }



    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", money_earned=" + money_earned +
                ", teacher=" + teacher +
                '}';
    }


}
