package course;

public class Course {
    private String name;
    private int number;
    private String teacher;
    private String cday;

    public Course(String name, int number, String teacher, String cday) {
        this.name = name;
        this.number = number;
        this.teacher = teacher;
        this.cday = cday;
    }

    public Course() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getCday() {
        return cday;
    }

    public void setCday(String cday) {
        this.cday = cday;
    }

    @Override
    public String toString() {
        return "\n\tCourse\n" +
                "name: " + name +
                "\nnumber: " + number +
                "\nteacher: " + teacher +
                "\ncday: " + cday;
    }
}
