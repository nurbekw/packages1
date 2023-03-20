package main;

import course.Course;
import course.Group;
import course.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Nurbek");
        student.setBirthday("28.10.2007");
        student.setAge(15);
        Student student1 = new Student();
        student1.setName("Aidar");
        student1.setBirthday("12.04.2004");
        student1.setAge(19);
        Student student2 = new Student();
        student2.setName("Safia");
        student2.setBirthday("28.10.2008");
        student2.setAge(14);
        Student student3 = new Student();
        student3.setName("Kuba");
        student3.setBirthday("15.05.2007");
        student3.setAge(15);
        Course course = new Course();
       course.setName("it.kg");
       course.setNumber(2);
       course.setTeacher("Azamat");
       course.setCday("06.02.2023");
        Group group = new Group();
        group.setStudents(new Student[]{student, student1,student2,student3});
        group.setC("it.Kg");
        group.setCstart("18:15-20:15");
        System.out.println(group);
    }
}