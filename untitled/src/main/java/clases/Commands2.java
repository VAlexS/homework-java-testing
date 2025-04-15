package clases;

import java.util.HashMap;

public class Commands2 {
    /* LOOKUP STUDENT [STUDENT_ID]: This command will display the full details of the specified student
SHOW TEACHERS: This command will display a list of all teachers
LOOKUP TEACHER [TEACHER_ID]: This command will display the full details of the specified teacher
SHOW PROFIT: This command will calculate (The total money earned from all courses) - (The sum of all the teachers' salaries) and return the result
 */
//
//    public enum Commands {
//        LOOKUP_STUDENT, SHOW_TEACHERS, LOOKUP_TEACHER, SHOW_PROFIT
//    }

    static HashMap<String, Student> students = new HashMap<>();
    static HashMap<String, Teacher> teachers = new HashMap<>();
    static HashMap<String, Course> courses = new HashMap<>();

    //LOOKUP STUDENT [STUDENT_ID]: This command will display the full details of the specified student
    public static Object lookupStudent(String studentId, HashMap<String, Student> studentsEnrolled) throws
             IllegalArgumentException {

        if (studentsEnrolled.containsKey(studentId)) {
            return studentsEnrolled.get(studentId).toString();
        } else {
            throw new IllegalArgumentException("Student not found.");
        }
    }

    //SHOW TEACHERS: This command will display a list of all teachers
    public static String showTeachers() throws IllegalStateException {
        if (teachers.isEmpty()) {
            throw new IllegalStateException("Sorry. Any available teacher yet.");
        } else {
            return teachers.toString();
        }
    }

//LOOKUP TEACHER [TEACHER_ID]: This command will display the full details of the specified teacher
    public static Object lookupTeacher(String teacherId, HashMap<String, Teacher> teachersHired) throws
            IllegalArgumentException {
        if (teachersHired.containsKey(teacherId)) {
            return teachersHired.get(teacherId).toString();
        } else {
            throw new IllegalArgumentException("Teacher not found.");
        }
    }

    //SHOW PROFIT: This command will calculate (The total money earned from all courses) - (The sum of all the teachers' salaries) and return the result
    public static double showProfit() throws IllegalStateException{
        double teachersCost = 0;
        double coursesIncome = 0;

        if (teachers.isEmpty()) {
            throw new IllegalStateException("Sorry. It was not possible to calculate profit because there is no available teachers");
        }
        if (courses.isEmpty()) {
            throw new IllegalStateException("Sorry. It was not possible to calculate profit because there is no available courses");
        }
        for (Teacher teacher: teachers.values()) {
            teachersCost += teacher.getSalary();
        }
        for (Course course: courses.values()) {
            coursesIncome+=course.getMoney_earned();
        }
        return coursesIncome-teachersCost;
    }
}
