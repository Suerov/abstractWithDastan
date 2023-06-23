
public class Main {
    public static void main(String[] args) {

         Student student= new Student("Turgunov", "Ahror", 18);
        Student student1= new Student("Khanyshbekov", "Bayjigit", 18);
        Student student2= new Student("Egemberdieva", "Tatysh", 15);
        Student []students={student,student1,student2};
        Teacher teacher=new Teacher("Abdullaev", "Dastan", 16, students);

        System.out.println(teacher);

    }
}