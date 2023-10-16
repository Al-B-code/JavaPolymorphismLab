import java.util.ArrayList;

public class Course {

    String courseCode;
    String courseName;
    ArrayList<Person> registeredPeople;


    public Course(String courseCode, String courseName){
        this.courseCode = courseCode;
        this.courseName = courseName;

        registeredPeople = new ArrayList<Person>();
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

}
