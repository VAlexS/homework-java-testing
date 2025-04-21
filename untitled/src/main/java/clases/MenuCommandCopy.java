package clases;

import clases.comandos.Commands;

import java.util.Scanner;

public class MenuCommandCopy {
    public static void launchMenuCommands() {

        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. INSCRIBIR estudiante en curso");
            System.out.println("2. ASIGNAR profesor a curso");
            System.out.println("3. MOSTRAR CURSOS");
            System.out.println("4. BUSCAR CURSO por ID");
            System.out.println("5. MOSTRAR ESTUDIANTES");
            System.out.println("6. BUSCAR ESTUDIANTE por ID");
            System.out.println("7. MOSTRAR PROFESORES");
            System.out.println("8. BUSCAR PROFESOR por ID");
            System.out.println("9. MOSTRAR GANANCIAS");
            System.out.println("10. SALIR");
            System.out.print("Seleccione una opción: ");

//            StringBuilder command = new StringBuilder(scanner.nextLine());
//            String opcion = String [];
//            for (int i = 0; i < opcion.length(); i++) {
//                if (opcion[i] != " ")
//                    opcion.append(opcion.toString()[i]);
//            } else(
//            break;
//                    )
//        }

            switch (opcion) {
                case "ENROLL": // Inscribir estudiante Id estudiante id curso

                    Commands.enroll(arg1, arg2);
                    break;

                case "ASSIGN ": //Asginar id profesor id curso

                    break;

                case "SHOW COURSES": //Mostrar cursos

                    break;

                case "LOOKUP COURSE": //Buscar curso
                    System.out.print("Ingrese ID del curso a buscar: ");

                    break;

                case "SHOW STUDENTS": // Mostrar Estudiante

                    break;

                case "LOOKUP STUDENT": //Buscar estudiante por ID
                    System.out.print("Ingrese ID del estudiante a buscar: ");

                    break;

                case "SHOW TEACHERS": //Mostrar profesores

                    break;

                case "LOOKUP TEACHER": //Buscar profesor by ID
                    System.out.print("Ingrese ID del profesor a buscar: ");
                    int profesorBuscar = scanner.nextInt();

                    break;

                case "SHOW PROFIT": //Mostrar ganancias

                    break;

                case "10":
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }

        } while (opcion != 0);

        command.close();
    }
}
