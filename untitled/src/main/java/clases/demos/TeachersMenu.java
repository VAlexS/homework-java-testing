package clases.demos;

import clases.Teacher;
import java.util.HashMap;
import java.util.Scanner;



//    The application starts by asking the user for a name for the school
//    Next, the user is asked for a number of how many teachers should be created
//    Next, the user is prompted to enter the details of each teacher (based on the number chosen above)


public class TeachersMenu {
    private static Scanner scanner = new Scanner(System.in);
    private static HashMap<String, Teacher> teachers = new HashMap<>();

// COLORES PARA LA TERMINAL
//    public static final String RESET = "\u001B[0m";
//    public static final String RED = "\u001B[31m";
//    public static final String GREEN = "\u001B[32m";
//    public static final String YELLOW = "\u001B[33m";
//    public static final String BLUE = "\u001B[34m";
//    public static final String PINK_BACK = "\u001B[45m";

    public static void main(String[] args) {

        createNewSchool();
        newTeacherMenu();

        System.out.println("¿Necesitas algo más?");
            boolean running = true;

            while (running) {
                System.out.println("========= MENÚ PRINCIPAL =========");
                System.out.println("1. Crear nueva escuela");
                System.out.println("2. Añadir profesores");
                System.out.println("3. Salir");
                System.out.print("Selecciona una opción: ");

                String choice = scanner.nextLine().trim();

                switch (choice) {
                    case "1":
                        createNewSchool();
                        break;
                    case "2":
                        newTeacherMenu();
                        break;

                    case "3":
                        running = false;
                        System.out.println("Saliendo del programa. ¡Hasta pronto!");
                        break;
                    default:
                        System.out.println("Opción no válida. Intenta de nuevo.");

                }
        }
    }


    public static void createNewSchool() {
        System.out.println("Introduce un nombre para crear una nueva escuela.");
        System.out.println("=========================");
        String schoolName = scanner.nextLine();
        System.out.println("Has creado la escuela " + schoolName.toUpperCase());
    }

    public static void newTeacherMenu() {
        String name;
        double salary;

        System.out.println("¿Quieres añadir profesores a tu escuela? ");
        System.out.println(" Sí [s] | No [n]");
        switch (scanner.nextLine().toLowerCase()) {
            case "s":
               break;
            case "n":
                System.out.println("De acuerdo.");
                return;
            default:
                throw new IllegalArgumentException();
        }
        System.out.println("=========================");
        System.out.println("¿Cuántos profesores necesitas?");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("¡De acuerdo, empecemos!");


        for (int i = 0; i < n; i++) {
            System.out.println("Cuál es el nombre del profesor número " + (i+1) + "?");
            name = scanner.nextLine().trim();
            if (name.isEmpty()) {
                throw new IllegalArgumentException("Debes introducir un nombre válido para continuar");
            }
            System.out.println("Está bien.¿Cuál será el salario para " + name.toUpperCase() + "?");
            salary = scanner.nextDouble();
            scanner.nextLine();
            if (salary < 0 ) {
                throw new IllegalArgumentException("El salario no puede ser negativo");
            }
            createTeacher(name, salary);
        }
        System.out.println("Profesores creados:");
        for (Teacher teacher : teachers.values()) {
            System.out.println(teacher.toString());
        }
    }


    public static void createTeacher(String name, double salary) {

       Teacher newTeacher = new Teacher(name, salary);
       teachers.put (newTeacher.getTeacherId(), newTeacher);
    }
}
