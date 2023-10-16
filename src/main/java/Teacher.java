public class Teacher extends Person{

    int teacherId;

    public Teacher(String name, int age, String address, int teacherId){
        super(name, age, address);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}
