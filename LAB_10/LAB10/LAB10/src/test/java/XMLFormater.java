import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class XMLFormater implements IFormatter{
    @Override
    public File format(List<Student> list) {
        File file= new File("Student.xml");
        try{
            PrintWriter printWriter=new PrintWriter("Student.xml");
            printWriter.write("<XML>");
            for(Student std:list){
                printWriter.write("<student>");
                printWriter.write(std.id+" "+std.name+" "+std.cgpa);
                printWriter.write("</student>");
                printWriter.write("\n");
            }
            printWriter.write("</XML>");
            printWriter.close();
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return file;
    }
}
