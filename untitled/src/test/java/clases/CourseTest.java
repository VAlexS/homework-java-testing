package clases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    Course course;

    @BeforeEach
    void setUpCourse(){
        course = new Course("Java-backend", 20.3);
    }


    @Test
    @DisplayName("Le cambio el nombre del curso")
    void changeName(){
        course.setName("Java-backend y sql");
        assertEquals("Java-backend y sql", course.getName());
    }

    @Test
    @DisplayName("Le cambio el profesor asociado al curso")
    void setUpTeacher(){
        course.setTeacher(new Teacher("Hector", 500));

        assertEquals("Hector", course.getTeacher().getName());
        assertEquals(500, course.getTeacher().getSalary());
    }

    @Test
    @DisplayName("Modifico el precio al curso")
    void changePriceCourse(){
        course.setPrice(24.56);

        assertEquals(24.56, course.getPrice());
    }

    @Test
    @DisplayName("Asigno el dinero ganado")
    void setMoneyEarned(){
        course.setMoney_earned(800);

        assertEquals(800, course.getMoney_earned());
    }

    @Test
    @DisplayName("Le mando un precio negativo para generar un error")
    void priceNegative(){
        assertThrows(IllegalArgumentException.class, () -> course.setPrice(-400));
    }

    @Test
    @DisplayName("Le mando una cantidad negativa de dinero ganado")
    void moneyEarnedWithNegativeValue(){
        assertThrows(IllegalArgumentException.class, () -> course.setMoney_earned(-800));
    }

}