package clases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {

    Teacher teacher;

    @BeforeEach
    void setUpTeacher(){
        teacher = new Teacher("Marcel", 200);
    }

    @Test
    @DisplayName("Modifico el nombre al profesor")
    void changeName(){
        teacher.setName("Hector");
        assertEquals("Hector", teacher.getName());
    }

    @Test
    @DisplayName("Modifico el sueldo al profesor")
    void changeSalary(){
        teacher.setSalary(500);
        assertEquals(500, teacher.getSalary());
    }

    @Test
    @DisplayName("Intento modificar el sueldo con una cantidad negativa para que me genere un error")
    void negativeSalary(){
        assertThrows(IllegalArgumentException.class, () -> teacher.setSalary(-500));
    }

}