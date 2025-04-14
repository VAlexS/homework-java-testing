package clases;

import java.util.UUID;

public class Course {

    private final String courseId;

    private String name;

    private double price;

    private double money_earned;

    //Pendiente por incluir: un atributo teacher de la clase Teacher (miembro privado)


    public Course(String name, double price) {
        courseId = UUID.randomUUID().toString();
        this.name = name;
        this.price = price;
        money_earned = 0; //inicialmente no ha habido gastos
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
        this.price = price;
    }

    public double getMoney_earned() {
        return money_earned;
    }

    public void setMoney_earned(double money_earned) {
        this.money_earned = money_earned;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", money_earned=" + money_earned +
                '}';
    }
}
