package clases;

import java.util.UUID;

public class Student {
    private final String studentId;
    private String name;
    private String address;
    private String email;
    private Course course;

    public Student(String name, String address, String email) {
        studentId = generateUUID();
        setName(name);
        setAddress(address);
        setEmail(email);
    }

    public String getStudentId() {
        return this.studentId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Course getCourse() {
        return this.course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    private String generateUUID(){
        return UUID.randomUUID().toString();

    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + this.studentId + '\'' +
                ", name='" + this.name + '\'' +
                ", address='" + this.address + '\'' +
                ", email='" + this.email + '\'' +
                ", course=" + this.course +
                '}';
    }
}
