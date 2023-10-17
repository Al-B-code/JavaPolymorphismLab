import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class UniversityTest {
    Teacher teacherBrian;
    Teacher teacherDavid;
    Student studentJohn;
    Course introToProteinStructure;
    Course introToGenetics;
    Course CS50;

    University university;

    @BeforeEach
    void setUp() {
        introToGenetics = new Course("IntroGen101", "Introduction to Genetics");
        introToProteinStructure = new Course("IntroPro101", "Introduction to Protein Structure");
        CS50 = new Course("CS50", "CS50, Introduction to Computer Science");
        teacherBrian = new Teacher("Brian Cox",55, "55 Broadway, READING, RG35 2CI", 12123434);
        teacherDavid = new Teacher("David Malan",55, "Harvard Street, Harvard", 2222222);
        studentJohn = new Student("John Smith", 18, "10 Downing Street", 123456789);

        university = new University("Open University");
    }

    @Test
    public void canGetName(){
        assertThat(university.getName()).isEqualTo("Open University");
    }
    @Test
    public void canSetName(){
        university.setName("Harvard");
        assertThat(university.getName()).isEqualTo("Harvard");
    }

    @Test
    public void canEnroll(){
        university.enroll(studentJohn);
        assertThat(university.getStudents().size()).isEqualTo(1);
    }

    @Test
    public void canEnroll__teacher(){
        university.enroll(teacherBrian);
        assertThat(university.getTeachers().size()).isEqualTo(1);
    }

    @Test
    public void canGetCourses(){
        assertThat(university.getCourses().size()).isEqualTo(0);
    }

    @Test
    public void canAddCourse(){
        university.addCourse(introToGenetics);
        assertThat(university.getCourses().size()).isEqualTo(1);
    }

    @Test
    public void canGetStudents(){
        university.enroll(studentJohn);
        assertThat(university.getStudents().get(0).getName()).isEqualTo("John Smith");
    }
    @Test
    public void canGetTeacher(){
        university.enroll(teacherBrian);
        assertThat(university.getTeachers().get(0).getName()).isEqualTo("Brian Cox");
    }

    @Test
    public void canGetTeacherCourseMap(){
        assertThat(university.getTeacherCourseMap().size()).isEqualTo(0);
    }

    @Test
    public void canAddTeacherAndCourse(){
        university.enroll(teacherDavid);
        university.enroll(teacherBrian);
        university.addCourse(introToGenetics);
        university.addCourse(introToProteinStructure);
        university.addCourse(CS50);

        university.addTeacherAndCourse(teacherBrian, introToGenetics);
        assertThat(university.getTeacherCourseMap().containsKey(teacherBrian)).isEqualTo(true);
        assertThat(university.getTeacherCourseMap().get(teacherBrian).contains(introToGenetics)).isEqualTo(true);
        university.addTeacherAndCourse(teacherBrian, introToProteinStructure);
        assertThat(university.getTeacherCourseMap().size()).isEqualTo(1);
        assertThat(university.getTeacherCourseMap().get(teacherBrian).contains(introToProteinStructure)).isEqualTo(true);
        university.addTeacherAndCourse(teacherDavid, CS50);
        assertThat(university.getTeacherCourseMap().containsKey(teacherDavid)).isEqualTo(true);
        System.out.println(university.getTeacherCourseMap());



    }



}
