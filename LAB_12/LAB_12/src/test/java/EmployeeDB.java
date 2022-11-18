import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class EmployeeDB {
    List<Employee> employeeList=new ArrayList<>();

    public void save ( Employee employee ) {
    FileWriter fw = null ;
    try {
        fw = new FileWriter ("myfile.txt", true ) ;
        fw . write ( employee . toString () + "\n") ;
        } catch ( IOException e ) {
        e . printStackTrace () ;
        }
    finally {
        try {
            fw . close () ;
            }
        catch ( IOException e ) {
            e . printStackTrace () ;
            }
        }
    }

    // this code will give error if there is no file
    public void anotherSave ()
    {
        try {
            Files.write(Paths.get (" myfile.txt ") , " the text ". getBytes () , StandardOpenOption. APPEND ) ;
        }
        catch (IOException e) {
            e.printStackTrace() ;
        }
    }

    public List<Employee> returnEmployeeList() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myfile.txt"));
        String line = null;
        List<Employee>list=new ArrayList<>();
        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            Employee employee= new Employee(Integer.parseInt(values[0]),values[1],Integer.parseInt(values[2]));
            list.add(employee);
        }
        br.close();
        return list;
    }
    public void addEmployee(Employee employee){
        employeeList.add(employee);//impure
    }
    public void add(List<Employee>employees,Employee employee){
        employees.add(employee);//impure
    }
    public List < Employee > ageFilter ( int age ) {
        List < Employee > employees = employeeList.stream().filter (
                employee -> employee.getAge() == age ) . collect ( Collectors. toList () ) ;
        return employees ;
    }
    public List < Employee > salaryFilter ( int salary) {
        List < Employee > employees = employeeList.stream().filter (
                employee -> employee.getSalary() > salary ) . collect ( Collectors. toList () ) ;
        return employees ;
    }
    public void incrementMapper (double percentage) {
        employeeList.stream().map(s-> (s.getSalary() * (percentage / 100))).forEach(System.out::println);
    }
    public void totalSalaryofFilteredEmployee(double minsalary){
        employeeList.stream().map(s-> (s.getSalary() * (minsalary / 100)) + s.getSalary()).forEach(System.out::println);
    }

}

