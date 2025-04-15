package clases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student;

    @BeforeEach
    void setUpStudent(){
        student = new Student("Victor", "Calle Norte 34, 5º A, Madrid", "victorsanz@gmail.com");
    }

    @Test
    @DisplayName("El estudiante no se ha matriculado en ningun curso")
    void courseNull(){
        assertNull(student.getCourse());
    }

    @Test
    @DisplayName("El estudiante se ha matriculado en un curso")
    void setUpCourseStudent(){
        student.setCourse(new Course("Database", 200));
        assertNotNull(student.getCourse());
    }

    @Test
    @DisplayName("Modifico el nombre al estudiante")
    void checkPrice(){
        student.setName("Alejandro");
        assertEquals("Alejandro", student.getName());
    }

    @Test
    @DisplayName("Modifico la direccion al estudiante")
    void changeAddress(){
        student.setAddress("Calle Falsa, 123");
        assertEquals("Calle Falsa, 123", student.getAddress());
    }



}