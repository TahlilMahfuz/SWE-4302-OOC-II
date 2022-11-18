import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testCase {
    @Test
    void Test1(){
        Student students = new Student();
        students.name="Tahlil";
        students.address="Gazipur";
        students.age="25";
        students.student_id="200042158";

        Faculty faculties= new Faculty();
        faculties.name="Muaz";
        faculties.address="Gazipur";
        faculties.designation="Lecturer";
        faculties.age="23";

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(students);
        persons.add(faculties);

        String expected="Student:Tahlil 25 Gazipur 200042158\n" +
                "Faculty:Muaz 23 Gazipur Lecturer\n";
        Printer printer = new Printer();
        assertEquals(expected,printer.<Person>printList(persons));
    }
}
