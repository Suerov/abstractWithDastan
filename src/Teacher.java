import java.util.Arrays;

public class Teacher extends  User{
    private Student[]students;
    public Teacher(String lastName, String name, int age, Student[] students) {
        super(lastName, name, age);
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Teacher:" +
                super.toString()+"\n"+
                "students:" +"\n"+ Arrays.toString(students);
    }
}
