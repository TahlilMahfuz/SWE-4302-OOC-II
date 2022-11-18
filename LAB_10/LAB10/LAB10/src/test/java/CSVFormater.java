
import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.List;

public class CSVFormater implements IFormatter{

    @Override
    public File format(List<Student> list) {
        File file= new File("Student.csv");
        try{
            PrintWriter printWriter=new PrintWriter("Student.csv");
            for(Student std:list){
                printWriter.write(std.id+" "+std.name+" "+std.cgpa);
                printWriter.write("\n");
            }
            printWriter.close();
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return file;
    }
}
