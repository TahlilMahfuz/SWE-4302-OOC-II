package assignment2.StampCoupling;

public class Student {
    String name,id;

    public Student(String name,String id){
        this.name=name;
        this.id=id;
    }

    public static void main(String[] args) {
        Student student=new Student("tahlil","58");
        StudentManipulator studentManipulator= new StudentManipulator();
        studentManipulator.ChangeID(student);
        System.out.println(student.id+" "+student.name);
    }
}

