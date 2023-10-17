import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CourseTest {

    Teacher teacher;
    Student student;
    Course course;

    @BeforeEach
    void setUp() {
        course = new Course("Bio101", "Biology");

        teacher = new Teacher("Brain Cox",55, "55 Broadway, READING, RG35 2CI", 12123434);
        student = new Student("John Smith", 18, "10 Downing Street", 123456789);
    }



    @Test
    void canGetCourseCode(){
        assertThat(course.getCourseCode()).isEqualTo("Bio101");
    }

    @Test
    void canGetCourseName(){
        assertThat(course.getCourseName()).isEqualTo("Biology");
    }

    @Test
    void canSetCourseName(){
        course.setCourseName("Chemistry 101");
        assertThat(course.getCourseName()).isEqualTo("Chemistry 101");

    }

    @Test
    void canAddRegisteredPeople(){
        course.addRegisteredPeople(teacher);
        assertThat(true).isEqualTo(course.registeredPeople.contains(teacher));
        course.addRegisteredPeople(student);
        assertThat(true).isEqualTo(course.registeredPeople.contains(student));
    }

    @Test
    void canGetRegisteredPeople(){
        course.addRegisteredPeople(teacher);
        System.out.println(course.getRegisteredPeople());
        assertThat(course.getRegisteredPeople().size()).isEqualTo(1);
    }

    @Test
    void canAddStudentFromRegisteredList(){
        course.addRegisteredPeople(teacher);
        assertThat(true).isEqualTo(course.registeredPeople.contains(teacher));
        course.addRegisteredPeople(student);
        assertThat(true).isEqualTo(course.registeredPeople.contains(student));
        course.addStudentFromRegisteredList();
        assertThat(course.studentList.size()).isEqualTo(1);

    }

    @Test
    void canAddTeacherFromRegisteredList(){
        course.addRegisteredPeople(teacher);
        assertThat(true).isEqualTo(course.registeredPeople.contains(teacher));
        course.addRegisteredPeople(student);
        assertThat(true).isEqualTo(course.registeredPeople.contains(student));
        course.addTeacherFromRegisteredList();
        assertThat(course.teacherList.size()).isEqualTo(1);
    }
}
