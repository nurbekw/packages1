package course;

import java.util.Arrays;

public class Group {
    Student[] students;
    private String c;
    private String cstart;

    public Group() {

    }

    public Group(Student[] students, String c, String cstart) {
        this.students = students;
        this.c = c;
        this.cstart = cstart;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getCstart() {
        return cstart;
    }

    public void setCstart(String cstart) {
        this.cstart = cstart;
    }
    @Override
    public String toString() {
        return "\tGroup\n" +
                "students: " + Arrays.toString(students) +
                "\nc: " + c +
                "\ncstart: " + cstart;
    }
}
