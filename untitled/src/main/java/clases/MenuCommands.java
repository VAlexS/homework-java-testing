package clases;

import java.util.Scanner;

public class MenuCommands {

    public static int checkCommand (String input) {
        String posibleCommand = input.toLowerCase();  // la entrada a minúsculas

        String[] validCommands = {
                "enroll \\d+ \\d+", //0
                "assign \\d+ \\d+",//1
                "show courses",//2
                "lookup course \\d+",//3
                "show students",//4
                "lookup student \\d+",//5
                "show teachers", //6
                "lookup teacher \\d+",//7
                "show profit" //8
        };
    /*
    for (String regex : validCommands) {
        if (posibleCommand.matches(regex)) {
            return true;
        }
    }*/
        for (int i=0; i<=posibleCommand.length();i++){
            if (posibleCommand.matches(validCommands[i])) {
                return i;
            }

        }
        return -1;

    }



    public static void launchMenuCommands() {

        Scanner scanner = new Scanner(System.in);
    int comando;

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

           String  scannedCommand = scanner.nextLine();

             comando  = checkCommand(scannedCommand);
            String [] commandArr = scannedCommand.trim().split(" ");
            switch (comando) {
                case 0: // Inscribir estudiante Id estudiante id curso
                    Commands.enroll(commandArr[1],commandArr[2],Commands.students, Commands.courses);
                    break;

                case 1: //Asginar id profesor id curso

                    break;

                case 2: //Mostrar cursos

                    break;

                case 3: //Buscar curso
                    System.out.print("Ingrese ID del curso a buscar: ");

                    break;

                case 4: // Mostrar Estudiante

                    break;

                case 5: //Buscar estudiante por ID
                    System.out.print("Ingrese ID del estudiante a buscar: ");

                    break;

                case 6: //Mostrar profesores

                    break;

                case 7: //Buscar profesor by ID
                    System.out.print("Ingrese ID del profesor a buscar: ");
                    int profesorBuscar = scanner.nextInt();

                    break;

                case 8: //MOstrar ganancias

                    break;

                case 9:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }

        } while (comando != 0);

        scanner.close();
    }

}
