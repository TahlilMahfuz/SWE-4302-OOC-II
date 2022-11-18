import java.util.Comparator;

public class SortByCGPA implements Comparator<Student> {
    public int compare(Student a, Student b)
    {
        return (int) (a.cgpa-b.cgpa);
    }
}
