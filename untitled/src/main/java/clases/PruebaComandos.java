package clases;
import clases.comandos.Commands;
import java.util.Scanner;

public class PruebaComandos {

    public static void main(String[] args) {
        Commands.initializeBBDD();
        System.out.println(Commands.students);
        System.out.println(Commands.courses);
        System.out.println(Commands.teachers);
        launchMenuCommands();
//        Scanner scanner = new Scanner(System.in);
//        String  scannedCommand = scanner.nextLine();
//
//        int comando  = checkCommand(scannedCommand);
//        String [] commandArr = scannedCommand.trim().split(" ");


        // PRUEBA COMANDO ENROLL
//        System.out.println("probando comando enroll...");
//        Commands.enroll(commandArr[1],commandArr[2],Commands.students, Commands.courses);
//
//        System.out.println("hemos pasado la llamada a enroll");
//
//        System.out.println(Commands.students);
//        System.out.println(Commands.courses);
//        System.out.println(Commands.teachers);
    }
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

        for (int i=0; i< validCommands.length;i++){ // aqui habia un error, tiene que iterar sobre valid comments
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
        System.out.println("Esperando comando");
        String  scannedCommand = scanner.nextLine();

        comando  = checkCommand(scannedCommand);
        String [] commandArr = scannedCommand.trim().split(" ");



//            System.out.println("\n--- MENÚ PRINCIPAL ---");
//            System.out.println("1. INSCRIBIR estudiante en curso");
//            System.out.println("2. ASIGNAR profesor a curso");
//            System.out.println("3. MOSTRAR CURSOS");
//            System.out.println("4. BUSCAR CURSO por ID");
//            System.out.println("5. MOSTRAR ESTUDIANTES");
//            System.out.println("6. BUSCAR ESTUDIANTE por ID");
//            System.out.println("7. MOSTRAR PROFESORES");
//            System.out.println("8. BUSCAR PROFESOR por ID");
//            System.out.println("9. MOSTRAR GANANCIAS");
//            System.out.println("10. SALIR");
//            System.out.print("Seleccione una opción: ");


            switch (comando) {
                case 0: // Inscribir estudiante Id estudiante id curso
                    Commands.enroll(commandArr[1],commandArr[2],Commands.students, Commands.courses);
                    System.out.println("Ok");
                    break;

                case 1: //Asginar id profesor id curso
                    Commands.assign(commandArr[1],commandArr[2],Commands.teachers, Commands.courses);
                    System.out.println("Ok");
                    break;

                case 2: //Mostrar cursos
                    Commands.showCourses(Commands.courses);
                    System.out.println("Ok");
                    break;

                case 3: //Buscar curso
                    Commands.lookupCourse(commandArr[2], Commands.courses);
                    System.out.println("Ok");
                    break;

                case 4: // Mostrar Estudiantes
                    Commands.showStudents(Commands.students);
                    System.out.println("Ok");
                    break;

                case 5: //Buscar estudiante por ID
                    Commands.lookupStudent(commandArr[2], Commands.students);
                    System.out.println("Ok");
                    break;

                case 6: //Mostrar profesores
                    Commands.showTeachers();
                    System.out.println("Ok");
                    break;

                case 7: //Buscar profesor by ID
                    Commands.lookupTeacher(commandArr[2], Commands.teachers);
                    System.out.println("Ok");
                    break;

                case 8: //MOstrar ganancias
                    Commands.showProfit();
                    System.out.println("Ok");
                    break;

                case 9:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }

        } while (comando != 9);

        scanner.close();
    }

}
