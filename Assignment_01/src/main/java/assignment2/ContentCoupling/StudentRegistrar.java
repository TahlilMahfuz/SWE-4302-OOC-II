package assignment2.ContentCoupling;

import java.util.ArrayList;
import java.util.List;

public class StudentRegistrar {
    void assignCgpa(Student student){
        student.cgpa=3.80;
    }

    public static void main(String[] args) {
        Student student=new Student("200042158","Tahlil");
        StudentRegistrar studentRegistrar=new StudentRegistrar();
        studentRegistrar.assignCgpa(student);
        System.out.println(student.name+" "+student.cgpa+" "+student.id);
        System.out.println("It's possible because of the public access modifier, if we use" +
                " private access modifier and ensure encapsulation this kind of coupling can be prohibited.");
    }
}
