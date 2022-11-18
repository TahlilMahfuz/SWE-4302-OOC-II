import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

public class StudentEnrollementTest {
    @Test
    void test1() throws InvalidStudentIDException {
        Student student=new Student("Tahlil",3.81);
        student.program = student.program.SWE;
        student.setId("200042158");
        StudentEnrollment studentEnrollment=new StudentEnrollment();
        studentEnrollment.add(student);
        StudentManipulator studentManipulator= new StudentManipulator();
        System.out.println();
        assertTrue(studentManipulator.getByID(studentEnrollment.students,"200042158") instanceof Student);
    }
    @Test
    void test2() throws InvalidStudentIDException {
        Student student=new Student("Tahlil",3.81);
        Student student1=new Student("Mahfuz",3.23);
        student.program = student.program.SWE;
        student1.program = student.program.SWE;
        student.setId("200042158");
        student1.setId("200042159");
        StudentEnrollment studentEnrollment=new StudentEnrollment();
        StudentManipulator studentManipulator= new StudentManipulator();
        studentEnrollment.add(student);
        studentEnrollment.add(student1);
        studentManipulator.remove(studentEnrollment.students,"200042158");
        assertFalse(studentManipulator.getByID(studentEnrollment.students,"200042158") instanceof Student);
    }
    @Test
    void test3() throws InvalidStudentIDException {
        Student student=new Student("Tahlil",3.81);
        Student student1=new Student("Mahfuz",3.23);
        student.program = student.program.SWE;
        student1.program = student.program.SWE;
        student.setId("200042158");
        student1.setId("200042159");
        StudentEnrollment studentEnrollment=new StudentEnrollment();
        StudentManipulator studentManipulator= new StudentManipulator();
        studentEnrollment.add(student);
        studentEnrollment.add(student1);
        assertTrue(studentManipulator.getAll(studentEnrollment.students) instanceof List<Student>);
    }
    @Test
    void test4() throws InvalidStudentIDException {
        Student student=new Student("Tahlil",3.81);
        Student student1=new Student("Mahfuz",3.23);
        student.program = student.program.SWE;
        student1.program = student.program.SWE;
        student.setId("200042158");
        student1.setId("200042159");
        StudentEnrollment studentEnrollment=new StudentEnrollment();
        StudentManipulator studentManipulator= new StudentManipulator();
        studentEnrollment.add(student);
        studentEnrollment.add(student1);
        studentManipulator.remove(studentEnrollment.students,student1);
        assertTrue(studentManipulator.getByObj(studentEnrollment.students,student) instanceof Student);
    }
    @Test
    void test5() throws InvalidStudentIDException {
        Student student=new Student("Tahlil",3.81);
        Student student1=new Student("Mahfuz",3.23);
        student.program = student.program.SWE;
        student1.program = student.program.SWE;
        student.setId("200042158");
        student1.setId("200042159");
        StudentEnrollment studentEnrollment=new StudentEnrollment();
        StudentManipulator studentManipulator= new StudentManipulator();
        Printer printer= new Printer();
        studentEnrollment.add(student);
        studentEnrollment.add(student1);
        String exp="Tahlil 200042158 3.81 SWE\n" +
                "Mahfuz 200042159 3.23 SWE\n";
        assertEquals(exp,printer.print(studentEnrollment.students));
    }
    @Test
    void test6() throws InvalidStudentIDException {
        Student student=new Student("Tahlil",3.81);
        Student student1=new Student("Mahfuz",3.23);
        student.program = student.program.SWE;
        student1.program = student.program.SWE;
        student.setId("200042190");
        student1.setId("200042159");
        StudentEnrollment studentEnrollment=new StudentEnrollment();
        studentEnrollment.add(student);
        studentEnrollment.add(student1);
        ResultPublication resultPublication=new ResultPublication();
        Printer printer=new Printer();

        List<Student>sortedlistid= resultPublication.publish(studentEnrollment.students,new SortByID());
        String s="Mahfuz 200042159 3.23 SWE\n" +
                "Tahlil 200042190 3.81 SWE\n";
        assertEquals(s,printer.print(sortedlistid));

        List<Student>sortedlistname= resultPublication.publish(studentEnrollment.students,new SortByName());
        String sname="Mahfuz 200042159 3.23 SWE\n" +
                "Tahlil 200042190 3.81 SWE\n";
        assertEquals(sname,printer.print(sortedlistname));

        List<Student>sortedlistcgpa= resultPublication.publish(studentEnrollment.students,new SortByCGPA());
        String scgpa="Mahfuz 200042159 3.23 SWE\n" +
                "Tahlil 200042190 3.81 SWE\n";
        assertEquals(scgpa,printer.print(sortedlistcgpa));

        List<Student>sortedlistcgpaid= resultPublication.publish(studentEnrollment.students,new SortByID(),new SortByCGPA());
        String scgpaid="Mahfuz 200042159 3.23 SWE\n" +
                "Tahlil 200042190 3.81 SWE\n";
        assertEquals(scgpaid,printer.print(sortedlistcgpaid));
    }
    @Test
    void test7() throws InvalidStudentIDException {
        Student student=new Student("Tahlil",3.81);
        Student student1=new Student("Mahfuz",3.23);
        student.program = student.program.SWE;
        student1.program = student.program.SWE;
        student.setId("200042158");
        student1.setId("200042159");
        StudentEnrollment studentEnrollment=new StudentEnrollment();
        StudentManipulator studentManipulator= new StudentManipulator();
        studentEnrollment.add(student);
        studentEnrollment.add(student1);
        Exporter exporter=new Exporter();
        CSVFormater csvFormater=new CSVFormater();
        File file= exporter.export(studentEnrollment.students,csvFormater);
        assertTrue(file instanceof File);
        XMLFormater xml=new XMLFormater();
        File file2= exporter.export(studentEnrollment.students,xml);
        assertTrue(file2 instanceof File);
    }
}
