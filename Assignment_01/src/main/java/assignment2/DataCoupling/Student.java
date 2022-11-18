package assignment2.DataCoupling;

public class Student {
    String name;
    int id;
    public Student(String name,int id){
        this.name=name;
        this.id=id;
    }

    public static void main(String[] args) {
        Student student=new Student("tahlil",200042158);
        StudentManipulator studentManipulator = new StudentManipulator();
        int new_id= studentManipulator.IncrementID(student.id);
        System.out.println("The id won't change,because of passed by value.The new_id will change." +
                "But won't be assigned to the student object." +
                "\n"+"This is called data coupling");
        System.out.println(student.id+" "+ student.name);
        System.out.println("New ID: "+new_id);
    }
}
