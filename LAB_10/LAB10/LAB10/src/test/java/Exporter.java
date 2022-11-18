import java.io.File;
import java.util.List;

public class Exporter {
    public File export(List<Student>students, IFormatter formatter){
        return formatter.format(students);
    }
}
