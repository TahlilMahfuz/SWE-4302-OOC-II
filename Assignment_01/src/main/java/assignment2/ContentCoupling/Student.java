package assignment2.ContentCoupling;

//Content Coupling:
//    -Violation of encapsulation
//    -Public access modifier
//    -Privilege to access data from anywhere
//    -Inappropriate Intimacy

public class Student {
    public String id,name;
    public double cgpa;

    public Student(String id,String name){
        this.id=id;
        this.name=name;
    }
}
