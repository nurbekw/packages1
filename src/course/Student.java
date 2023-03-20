package course;

public class Student {
    private String name;
    private String birthday;
    private int age;

    public Student(String name, String birthday, int age) {
        this.name = name;
        this.birthday = birthday;
        this.age = age;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        if (this.age>0){
            this.age = age;
        }
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "name: " + name +
                "\nbirthday: " + birthday +
                "\nage: " + age;
    }
}
