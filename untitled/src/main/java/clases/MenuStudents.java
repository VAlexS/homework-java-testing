package clases;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class  MenuStudents {


    public Student[] launchMenu(Map<String, Student> studentsMap) {
        int numStudentsToRegister=howManyStudents();
        Student[] studentsRegistered= new Student[numStudentsToRegister];

        for (int i=0;i<numStudentsToRegister;i++){
            Student student = studentRegistration();
            studentsRegistered[i]=student;

        }
        return studentsRegistered;
    }

    public String getStudentNameRegistration() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Intoduzca nombre del estudiante ");
        return scan.nextLine();
    }

    public String getStudentAddressRegistration() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca dirección de estudante: ");
        return scan.nextLine();
    }

    public String getStudentEmailRegistration() {
        boolean correctMail = false;
        Scanner scan = new Scanner(System.in);
        while (!correctMail) {
            System.out.println("Email de estudiante: ");
        }
        return scan.nextLine();
    }

    public Student studentRegistration() {
        String name = getStudentNameRegistration();
        String address = getStudentAddressRegistration();
        String email = getStudentEmailRegistration();

        return new Student(name, address, email);
    }

    boolean isValidMail(String mail) {
        String regexEmail = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regexEmail);
        Matcher match = pattern.matcher(mail);
        return match.matches();
    }

    public int howManyStudents() throws InputMismatchException{
        boolean correctNumber = false;
        int numStudent = 0;
        Scanner scan = new Scanner(System.in);

        while (!correctNumber) {
            try {
                System.out.println("¿Cuantos estudiantes quiere registrar?: ");
                numStudent = scan.nextInt();
                correctNumber = true;
            } catch (InputMismatchException e) {
                System.out.println(("Por favor, inserta un valor correcto"));
                scan.next();
            }

        }
        return numStudent;
    }


}