import interfaces.Studyable;
import interfaces.Teachable;

import java.util.ArrayList;

public class Course {

    String courseCode;
    String courseName;
    ArrayList<Person> courseMembers;
    ArrayList<Student> studentList;
    ArrayList<Teacher> teacherList;


    public Course(String courseCode, String courseName){
        this.courseCode = courseCode;
        this.courseName = courseName;

        this.courseMembers = new ArrayList<>();

        this.teacherList = new ArrayList<>();
        this.studentList = new ArrayList<>();


    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Person> getCourseMembers() {
        return courseMembers;
    }
    public void addCourseMember(Person person) {
        courseMembers.add(person);
    }

    public void addStudent(Student student){
        studentList.add(student);
    }
    public void addTeacher(Teacher teacher){
        teacherList.add(teacher);
    }

    public ArrayList<Student> getStudentList(){
        return studentList;
    }
    public ArrayList<Teacher> getTeacherList(){
        return teacherList;
    }


//    public void addStudentFromRegisteredList() {
//
//        for (Person person : registeredPeople) {
//            if (person instanceof Studyable) {
//                studentList.add(person);
//            }
//        }
//    }
//
//    public void addTeacherFromRegisteredList(){
//        for (Person person : registeredPeople) {
//            if (person instanceof Teachable) {
//                teacherList.add(person);
//            }
//        }
//    }
}
