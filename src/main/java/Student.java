public class Student extends Person{

    int studentId;
    public Student(String name, int age, String address, int studentId) {
        super(name, age, address);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
