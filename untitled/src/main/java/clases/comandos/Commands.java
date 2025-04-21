package clases.comandos;

import clases.Course;
import clases.Student;
import clases.Teacher;

import java.util.*;

public class Commands {

//----------------------additional methods----------------------------------------
    /*
    Function:
             If exist studentId return true.
    @Pre:  parameter2 Map key String value, Generic Type
    @Post: Display values from Map parameter.
     */

    public static HashMap<String, Student> students = new HashMap<>();
   public  static HashMap<String, Teacher> teachers = new HashMap<>();
    public static HashMap<String, Course> courses = new HashMap<>();

    public static void initializeBBDD(){
    Student student1 = new Student("Juan", "Calle Falsa", "juan@gmail.com");
    students.put(student1.getStudentId(), student1);

    Course course1 = new Course("Python", 300);
    courses.put(course1.getName(), course1);

    Teacher teacher1 = new Teacher("Jacinta", 1900);
    teachers.put(teacher1.getTeacherId(), teacher1);
}



    private static boolean existStudentId(String studentId, Map<String, Student> studentMap)
            throws IllegalArgumentException {

        if (studentMap.containsKey(studentId)) {
            return true;
        } else {
            throw new IllegalArgumentException("Student ID does not exist.");
        }
    }

    private static boolean existTeacherId(String teacherId, Map<String, Teacher> teacherMap)
            throws IllegalArgumentException {

        if (teacherMap.containsKey(teacherId)) {
            return true;
        } else {
            throw new IllegalArgumentException("Teacher ID does not exist.");
        }
    }

    private static boolean existCourseId(String courseId, Map<String, Course> courseMap)
            throws IllegalArgumentException {

        if (courseMap.containsKey(courseId)) {
            return true;
        } else {
            throw new IllegalArgumentException("Course ID does not exist.");
        }
    }


    /*
    Generic Function:
                Print on Screen values prom List parameter.
    @Pre: 1 parameter List
    @Post: Display values from List  parameter.
     */

    private static <E> void display(List<E> list) {
        if (list == null) throw new IllegalArgumentException("Avoid argument");
        StringBuilder output = new StringBuilder();
        for (E elem : list) {
            output.append(elem).append("\n");
        }
        System.out.println(output);
    }

    // This is specific function. I have been developed generic functions.->'getFromMap'
    private static List<Course> getCoursesFromMap(Map<String, Course> courseMap) {
        //  return new ArrayList<>(courseMap.values());
        ArrayList<Course> courseList = new ArrayList<>();
        courseList.addAll(courseMap.values());
        return courseList;
    }

    /*
    Generic Function:
                Return List of values from Map parameter
    @Pre: 1 parameter Map key String value, Generic Type
    @Post: Return List of values.
     */
    private static <T> List<T> getFromMap(Map<String, T> map) {
        //  return new ArrayList<>(courseMap.values());
        ArrayList<T> listFromMap = new ArrayList<>();
        listFromMap.addAll(map.values());
        return listFromMap;
    }

    /*
    Generic Function:
                Print on Screen
    @Pre: 1 parameter Map key String value, Generic Type
    @Post: Display values from Map parameter.
     */
    private static <T> void show(Map<String, T> map) {
        List list = getFromMap(map);
        display(list);
    }

//------------------------------end additional methods-----------------------------

    //method_1
    public static void enroll(String studentId,
                              String courseId,
                              Map<String, Student> studentMap,
                              Map<String, Course> courseMap) throws IllegalArgumentException {

        boolean existUserId = existStudentId(studentId, studentMap);
        boolean existCourseId = existCourseId(courseId, courseMap);

        if (existUserId && existCourseId) {
            Student student = studentMap.get(studentId);
            Course course = courseMap.get(courseId);
            student.setCourse(course);
        }
    }

    //method_2
    public static void assign(String teacherId, String courseId,
                              Map<String, Teacher> teacherMap,
                              Map<String, Course> courseMap) {

        boolean existTeacherId = existTeacherId(teacherId, teacherMap);
        boolean existCourseId = existCourseId(courseId, courseMap);

        if (existTeacherId && existCourseId) {
            Teacher teacher = teacherMap.get(teacherId);
            Course course = courseMap.get(courseId);
            course.setTeacher(teacher);
        }
    }

    // method_3
    public static void showCourses(Map<String, Course> courseMap) {
        List courseList = getCoursesFromMap(courseMap);
        display(courseList);
    }


    //method_4
    // Show through standard output course details.
    public static void lookupCourse(String courseId, Map<String, Course> listMap) {
        boolean existCourse = existCourseId(courseId, listMap);
        if (existCourse) {
            System.out.println(listMap.get(courseId).toString());
        }
    }

    //method_5
    public static void showStudents(Map<String, Student> studentMap) {


    }

    //==================================
    // clase commands2


    //LOOKUP STUDENT [STUDENT_ID]: This command will display the full details of the specified student
    public static String lookupStudent(String studentId, HashMap<String, Student> studentsEnrolled) throws
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
    public static double showProfit() throws IllegalStateException {
        double teachersCost = 0;
        double coursesIncome = 0;

        if (teachers.isEmpty()) {
            throw new IllegalStateException("Sorry. It was not possible to calculate profit because there is no available teachers");
        }
        if (courses.isEmpty()) {
            throw new IllegalStateException("Sorry. It was not possible to calculate profit because there is no available courses");
        }
        for (Teacher teacher : teachers.values()) {
            teachersCost += teacher.getSalary();
        }
        for (Course course : courses.values()) {
            coursesIncome += course.getMoney_earned();
        }
        return coursesIncome - teachersCost;
    }


}
