package clases;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Commands1 {


//----------------------additional methods----------------------------------------
    /*
    Function:
             If exist studentId return true.
    @Pre:  parameter2 Map key String value, Generic Type
    @Post: Display values from Map parameter.
     */

    public boolean existStudentId (String studentId, Map<String, Student> studentMap)
                        throws IllegalArgumentException{

        if(studentMap.containsKey(studentId)) {return true;
        } else {throw new IllegalArgumentException("Student ID does not exist.");}
    }

    public boolean existTeacherId (String teacherId, Map<String, Teacher> teacherMap)
            throws IllegalArgumentException{

        if(teacherMap.containsKey(teacherId)) {return true;
        } else {throw new IllegalArgumentException("Teacher ID does not exist.");}
    }

    public boolean existCourseId (String courseId, Map<String, Course> courseMap)
            throws IllegalArgumentException{

        if(courseMap.containsKey(courseId)) {return true;
        } else {throw new IllegalArgumentException("Course ID does not exist.");}
    }


    /*
    Generic Function:
                Print on Screen values prom List parameter.
    @Pre: 1 parameter List
    @Post: Display values from List  parameter.
     */

    public <E> void display(List<E> list){
        if (list==null) throw new IllegalArgumentException ("Avoid argument");
        StringBuilder output = new StringBuilder();
        for (E elem:list){
            output.append(elem).append("\n");
        }
        System.out.println(output.toString());
    }

// This is specific function. I have been developed generic functions.->'getFromMap'
    public List<Course> getCoursesFromMap(Map<String, Course> courseMap){
        //  return new ArrayList<>(courseMap.values());
        ArrayList<Course> courseList= new ArrayList<>();
        courseList.addAll(courseMap.values());
        return courseList;
    }

    /*
    Generic Function:
                Return List of values from Map parameter
    @Pre: 1 parameter Map key String value, Generic Type
    @Post: Return List of values.
     */
    public <T> List<T> getFromMap(Map<String, T> map) {
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
    public <T> void show( Map<String, T> map) {
        List list = getFromMap(map);
        display(list);
    }

//------------------------------end additional methods-----------------------------

//method_1
    public void enroll(String studentId,
                     String courseId,
                     Map<String, Student> studentMap,
                     Map<String, Course> courseMap) throws IllegalArgumentException {

        boolean existUserId= existStudentId(studentId,studentMap);
        boolean existCourseId=existCourseId(courseId,courseMap);

        if (existUserId && existCourseId) {
            Student student = studentMap.get(studentId);
            Course course = courseMap.get(courseId);
            student.setCourse(course);
        }
    }

//method_2
    public void assign (String teacherId, String courseId ,
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
    public void showCourses ( Map<String, Course> courseMap){
        List courseList = getCoursesFromMap(courseMap);
        display(courseList);
    }


 //method_4
    // Show through standard output course details.
    public void lookupCourse (String courseId, Map<String, Course> listMap){
        boolean existCourse = existCourseId(courseId, listMap );
        if (existCourse){
            System.out.println(listMap.get(courseId).toString());
        }
    }

 //method_5
    public void showStudents (Map<String, Student> studentMap){


    }




}
