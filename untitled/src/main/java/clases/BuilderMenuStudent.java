package clases;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public  class BuilderMenuStudent {

    //Estructuras de datos creadas por Ángela git
    static HashMap<String, Student> students = new HashMap<>();
    static HashMap<String, Teacher> teachers = new HashMap<>();
    static HashMap<String, Course> courses = new HashMap<>();


    public void buildMenuStudents() {
        MenuStudents menuStudents = new MenuStudents();//Map de Students
        try {

            Student[] resgiteredStudents = menuStudents.launchMenu(students);// Map con los estudiantes


        } catch (InputMismatchException e) {
            System.out.println("Error en los datos para registrar estudiante.");
        }
    }


}


