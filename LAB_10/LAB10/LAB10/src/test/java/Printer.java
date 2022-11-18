import java.util.List;

public class Printer {
    public String print(Student student){
        return student.name+" "+student.id+" "+student.cgpa+" "+student.program;
    }
    public String print(List<Student> studentList){
        String exp="";
        for(Student std:studentList){
            exp+=print(std);
            exp+="\n";
        }
        return exp;
    }
}
