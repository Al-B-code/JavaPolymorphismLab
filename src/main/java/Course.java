import interfaces.Studyable;
import interfaces.Teachable;

import java.util.ArrayList;

public class Course {

    String courseCode;
    String courseName;
    ArrayList<Person> registeredPeople;
    ArrayList<Person> studentList;
    ArrayList<Person> teacherList;


    public Course(String courseCode, String courseName){
        this.courseCode = courseCode;
        this.courseName = courseName;

        this.registeredPeople = new ArrayList<>();

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

    public ArrayList<Person> getRegisteredPeople() {
        return registeredPeople;
    }

    public void addRegisteredPeople(Person person) {
        registeredPeople.add(person);
    }

    public void addStudentFromRegisteredList() {

        for (Person person : registeredPeople) {
            if (person instanceof Studyable) {
                studentList.add(person);
            }
        }
    }

    public void addTeacherFromRegisteredList(){
        for (Person person : registeredPeople) {
            if (person instanceof Teachable) {
                teacherList.add(person);
            }
        }
    }
//    public void addTeacherFromRegisteredList()


//    public Student getListOfStudentsOnCourse(){
//        ArrayList<Student> studentList = new ArrayList<>();
//        for (int i = 0; i < registeredPeople.size(); i++) {
//            if (registeredPeople.get(i).){
//
//            }
//
//        }

//    }

}
