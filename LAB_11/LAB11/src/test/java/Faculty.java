import java.util.ArrayList;
import java.util.List;

@DevelopmentHistory(version = 1,developer = "Tahlil",tester = "Muaz")
public class Faculty {
    String name, designation;
    double salary;
    List<Course> courses = new ArrayList<>();


    public Faculty(String name,String designation,double salary,List<Course> list){
        this.name=name;
        this.designation=designation;
        this.salary=salary;
        for(Course c:list){
            courses.add(c);
        }
    }

    @DevelopmentHistoryWithReviewer(reviewers = {"Tahlil","Muaz"},
            developmentHistory = @DevelopmentHistory(version = 1,developer = "Tahlil",tester = "Muaz"))
    @DevelopmentHistory(version = 2,developer = "Muaz",tester = "tahlil")
    public Faculty(String name,String designation,double salary){
            this.name=name;
            this.designation=designation;
            this.salary=salary;
        }

    @DevelopmentHistoryWithReviewer(reviewers = {"Tahlil","Muaz"},
            developmentHistory = @DevelopmentHistory(version = 1,developer = "Tahlil",tester = "Muaz"))
    @DevelopmentHistory(version = 2,developer = "Muaz",tester = "tahlil")
    public void teach(CourseType course){
        System.out.println("I can teach");
    }

    @DevelopmentHistoryWithReviewer(reviewers = {"Tahlil","Muaz"},
            developmentHistory = @DevelopmentHistory(version = 1,developer = "Tahlil",tester = "Tahlil"))
    @DevelopmentHistory(version = 2,developer = "Muaz",tester = "tahlil")
    public void research(String topic){
        System.out.println("I can research");
    }

}
