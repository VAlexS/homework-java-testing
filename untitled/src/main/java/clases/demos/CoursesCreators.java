package clases.demos;

import clases.Course;

import java.util.Scanner;

public class CoursesCreators {


    public static void createCourses(){
        var scanner = new Scanner(System.in);


        System.out.print("¿Cuántos cursos deseas crear? ");
        int numCourses = scanner.nextInt();

        var courses = createCourses(numCourses);

        System.out.println("Los cursos que has creado son ");
        System.out.println("=========================");
        for (Course course : courses)
            System.out.println(course);
    }


    /**
     *
     * @param numCourses el numero de cursos que se desea crear
     */
    private static Course[] createCourses(int numCourses){

        Course[] courses = new Course[numCourses];

        var scanner = new Scanner(System.in);

        String name;
        double price;

        for (int i = 0; i < numCourses; i++) {
            System.out.println("Vas a meter el curso numero "+(i+1)+"/"+numCourses);

            System.out.print("¿Cómo se va a llamar el curso? ");
            name = scanner.nextLine();

            System.out.print("¿Qué precio le vas a poner? ");
            price = scanner.nextDouble();

            scanner.nextLine(); //limpio el buffer para que no se me sobreescriba todo

            courses[i] = new Course(name, price);
        }

        return courses;
    }

}
