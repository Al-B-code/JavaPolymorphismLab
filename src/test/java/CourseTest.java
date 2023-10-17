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
        course.addCourseMember(teacher);
        assertThat(true).isEqualTo(course.courseMembers.contains(teacher));
        course.addCourseMember(student);
        assertThat(true).isEqualTo(course.courseMembers.contains(student));
    }

    @Test
    void canGetRegisteredPeople(){
        course.addCourseMember(teacher);
        System.out.println(course.getCourseMembers());
        assertThat(course.getCourseMembers().size()).isEqualTo(1);
    }

    @Test
    void canGetStudentList(){
        assertThat(course.getStudentList().size()).isEqualTo(0);
    }
    @Test
    void canGetTeacherList(){
        assertThat(course.getTeacherList().size()).isEqualTo(0);
    }
    @Test
    void canAddStudent(){
        course.addStudent(student);
        assertThat(course.studentList.contains(student)).isEqualTo(true);
    }

    @Test
    void canAddTeacher(){
        course.addTeacher(teacher);
        assertThat(course.teacherList.contains(teacher)).isEqualTo(true);

    }


//    @Test
//    void canAddStudentFromRegisteredList(){
//        course.addCourseMember(teacher);
//        assertThat(true).isEqualTo(course.courseMembers.contains(teacher));
//        course.addCourseMember(student);
//        assertThat(true).isEqualTo(course.courseMembers.contains(student));
//        course.addStudentFromRegisteredList();
//        assertThat(course.studentList.size()).isEqualTo(1);
//
//    }
//
//    @Test
//    void canAddTeacherFromRegisteredList(){
//        course.addCourseMember(teacher);
//        assertThat(true).isEqualTo(course.courseMembers.contains(teacher));
//        course.addCourseMember(student);
//        assertThat(true).isEqualTo(course.courseMembers.contains(student));
//        course.addTeacherFromRegisteredList();
//        assertThat(course.teacherList.size()).isEqualTo(1);
//    }
}
