public class User {
    private String LastName;
    private  String Name;
    private  int age;

    public User() {
    }

    public User(String lastName, String name, int age) {
        LastName = lastName;
        Name = name;
        this.age = age;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\n"+"LastName:" + LastName +"\n" +
                " Name:" + Name + "\n" +
                "age:" + age ;
    }
}
