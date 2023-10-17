import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

public class StudentTest {

    Student student;

    @BeforeEach
    public void setUp(){

        student = new Student("John", 18, "10 Downing Street",123456789);

    }

    @Test
    public void canGetName(){
        assertThat(student.getName()).isEqualTo("John");
    }
    @Test
    public void canGetAge(){
        assertThat(student.getAge()).isEqualTo(18);
    }
    @Test
    public void canGetAddress(){
        assertThat(student.getAddress()).isEqualTo("10 Downing Street");
    }

    @Test
    public void canGetStudentId(){
        assertThat(student.getStudentId()).isEqualTo(123456789);
    }
    @Test
    public void canSetStudentId() {
        student.setStudentId(987654321);
        assertThat(student.getId()).isEqualTo(987654321);
    }


}
