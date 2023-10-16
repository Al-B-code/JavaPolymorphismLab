import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TeacherTest {

    Teacher teacher;

    @BeforeEach
    public void setUp(){

        teacher = new Teacher("John", 18, "10 Downing Street",123456789);

    }

    @Test
    public void canGetName(){
        assertThat(teacher.getName()).isEqualTo("John");
    }
    @Test
    public void canGetAge(){
        assertThat(teacher.getAge()).isEqualTo(18);
    }
    @Test
    public void canGetAddress(){
        assertThat(teacher.getAddress()).isEqualTo("10 Downing Street");
    }

    @Test
    public void canGetStudentId(){
        assertThat(teacher.getTeacherId()).isEqualTo(123456789);
    }
    @Test
    public void canSetStudentId(){
        teacher.setTeacherId(987654321);
        assertThat(teacher.getTeacherId()).isEqualTo(987654321);
    }
}
