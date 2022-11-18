import java.util.ArrayList;
import java.util.List;

public class FacultyMemberList {
    public List<Faculty> returnList(){
        Faculty faculty1=new Faculty("Muaz", "Student", 300000000);
        Faculty faculty2=new Faculty("Tahlil", "Student", 300);
        Faculty faculty3=new Faculty("Mamun", "Student", 3000);
        Faculty faculty4=new Faculty("Mukit", "Student", 1000);
        Faculty faculty5=new Faculty("Tohfa", "Student", 100);
        
        List<Faculty> list= new ArrayList<>();
        list.add(faculty1);
        list.add(faculty2);
        list.add(faculty3);
        list.add(faculty4);
        list.add(faculty5);
        List<Faculty> salarylessthanlist=new ArrayList<>();
        for(Faculty f:list) {
            if (f.salary > 2000) {
                salarylessthanlist.add(f);
                System.out.println(f.name+" "+f.designation+" "+f.salary);
            }
        }
        return salarylessthanlist;
    }

    public static void main(String[] args) {
        FacultyMemberList facultyMemberList = new FacultyMemberList();
        List<Faculty> faculties=new ArrayList<>();
        faculties= facultyMemberList.returnList();
    }
}
