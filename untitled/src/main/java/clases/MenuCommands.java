package clases;

import java.util.Scanner;

public class MenuCommands {


    public static void launchMenuCommands() {

        Scanner scanner = new Scanner(System.in);
        int opcion;

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

            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar el buffer

            switch (opcion) {
                case 1: // Inscribir estudiante Id estudiante id curso
                    System.out.print("Introduzca el id del estudiante: ");
                    String id = scanner.nextLine();
                    break;

                case 2: //Asginar id profesor id curso

                    break;

                case 3: //Mostrar cursos

                    break;

                case 4: //Buscar curso
                    System.out.print("Ingrese ID del curso a buscar: ");

                    break;

                case 5: // Mostrar Estudiante

                    break;

                case 6: //Buscar estudiante por ID
                    System.out.print("Ingrese ID del estudiante a buscar: ");

                    break;

                case 7: //Mostrar profesores

                    break;

                case 8: //Buscar profesor by ID
                    System.out.print("Ingrese ID del profesor a buscar: ");
                    int profesorBuscar = scanner.nextInt();

                    break;

                case 9: //MOstrar ganancias

                    break;

                case 10:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }

        } while (opcion != 0);

        scanner.close();
    }

}
