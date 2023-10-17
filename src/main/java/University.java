import interfaces.Teachable;

import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;

public class University {

    private String name;
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;
    private ArrayList<Course> courses;
    private HashMap<Teacher, ArrayList<Course>> teacherCourseMap;


    public University(String name){
        this.name = name;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.teacherCourseMap = new HashMap<>();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
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

    public HashMap<Teacher, ArrayList<Course>> getTeacherCourseMap() {
        return teacherCourseMap;
    }

    public void addTeacherAndCourse(Teacher teacher, Course course) {
        if (teachers.contains(teacher) && courses.contains(course)) {
            if (!teacherCourseMap.containsKey(teacher)) {
                teacherCourseMap.put(teacher, new ArrayList<>());
            }
            teacherCourseMap.get(teacher).add(course);
        }
    }


}
