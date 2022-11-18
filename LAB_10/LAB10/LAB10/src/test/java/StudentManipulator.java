import java.util.List;

public class StudentManipulator {

    public void remove(List<Student>students,String id){
        for(Student student:students){
            if(student.id.equals(id)){
                students.remove(student);
                break;
            }
        }
    }
    public void remove(List<Student>students,Student studentobject){
        for(Student student:students){
            if(student==studentobject){
                students.remove(student);
                break;
            }
        }
    }
    public Student getByID(List<Student>students,String id){
        for(Student student:students) {
            if (student.id==id) {
                return student;
            }
        }
        return null;
    }
    public Student getByObj(List<Student>students,Student studentobj){
        for(Student student:students){
            if(student.equals(studentobj)){
                return student;
            }
        }
        return null;
    }
    public List<Student> getAll(List<Student>students){
        return students;
    }
}
