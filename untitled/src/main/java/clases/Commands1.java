package clases;

import java.util.Map;

public class Commands1 {

    /*
    enroll the student specified in the corresponding course
     */
    public void enroll(String studentId,
                     String courseId,
                     Map<String, Student> studentMap,
                     Map<String, Course> courseMap) throws IllegalArgumentException {


        if(studentMap.containsKey(studentId)) {
            Student studentEnrolled = studentMap.get(studentId);
        } else {
            throw new IllegalArgumentException("Student ID does not exist.");
        }

        if (courseMap.containsKey(courseId)) {
            Course course = courseMap.get(courseId);
        }else {
            throw new IllegalArgumentException("Course ID does not exist.");

        }
    }

    public assign (String teacherId, String courseId){

    }




}
