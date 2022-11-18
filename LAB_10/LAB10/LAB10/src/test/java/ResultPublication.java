import java.util.Collections;
import java.util.List;

public class ResultPublication {
    public List<Student> publish(List<Student> list,SortByID sorting){
        Collections.sort(list,sorting);
        return list;
    }
    public List<Student> publish(List<Student> list,SortByCGPA sorting){
        Collections.sort(list,sorting);
        return list;
    }
    public List<Student> publish(List<Student> list,SortByName sorting){
        Collections.sort(list,sorting);
        return list;
    }
    public List<Student> publish(List<Student> list,SortByID sorting1,SortByCGPA sorting2){
        List<Student> studentList=list;
        Collections.sort(list,sorting2);
        if(studentList.equals(list)){
            Collections.sort(list,sorting1);
            return list;
        }
        return list;
    }
}
