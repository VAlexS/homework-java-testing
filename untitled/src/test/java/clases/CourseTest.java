package clases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    Course course;

    @BeforeEach
    void setUpCourse(){
        course = new Course("Java-backend", 20.3, new Teacher("Marcel", 500));
    }


    @Test
    @DisplayName("Le cambio el nombre del curso")
    void changeName(){
        course.setName("Java-backend y sql");
        assertEquals("Java-backend y sql", course.getName());
    }

    @Test
    void changeTeacher(){
        course.setTeacher(new Teacher("Hector", 500));

        assertEquals("Hector", course.getTeacher().getName());
    }





}