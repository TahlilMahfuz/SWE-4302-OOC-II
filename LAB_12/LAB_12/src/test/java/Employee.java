import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Employee {
    private int ID, experience,age;
    double salary;
    private String name;
    public Employee(String name) {
        this.name = name;
    }

    public Employee(int id, String name, int experience) {
        this.ID=id;
        this.name=name;
        this.experience=experience;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public double getSalary(){
        return this.salary;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }

    public void setId(int newID) {
        this.ID = (int) (Math.random() * newID);
    }
    public void setName(String name){
        this.name=name;
    }

    public void setExperience(Date joining) {
        Calendar calendar = Calendar.getInstance(Locale.US);
        calendar.setTime(joining);
        LocalDateTime now = LocalDateTime.now();
        int years = now.getYear() - calendar.get(Calendar.YEAR);
        this.experience = years;
    }
    @Override
    public String toString () {
        return ID+","+name+","+experience+"\n";
    }
}