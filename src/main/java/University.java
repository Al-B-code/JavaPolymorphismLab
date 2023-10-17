import interfaces.Teachable;

import java.util.ArrayList;
import java.util.HashMap;

public class University {

    private String name;
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;
    private ArrayList<Course> courses;
    private HashMap<Teacher, ArrayList<Course>> teacherCourseMap;


    public void getName(String name){
        this.name = name;
    }

    public String setName(String name){
        this.name = name;
    }

    public void enroll(Student student){
        students.add(student);
    }

    public void enroll(Teacher teacher){
        teachers.add(teacher);
    }

    public ArrayList<Course> getCourses(){
        return courses;
    }

    public void addCourse(Course course){
        courses.add(course);
    }
    public ArrayList<Student> getStudents(){
        return students;
    }
    public ArrayList<Teacher> getTeachers(){
        return teachers;
    }




}
