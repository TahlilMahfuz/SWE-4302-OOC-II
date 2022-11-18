import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Objects;

public class testFacultyClass {
    @Test
    void test1(){
        List<Course>list=new ArrayList<>();
        Course course1=new Course();
        course1.courseCode=1;
        course1.name="OOC II";
        course1.courseType=CourseType.theory;
        course1.credit=3.00;
        list.add(course1);
        Faculty faculty1=new Faculty("Tahlil","Student",1000000,list);
        Faculty faculty2=new Faculty("Muaz","Student",300000000);
    }
    @Test
    void test2(){
        Object faculty=new Faculty("Muaz","Student",300000000);
        Method[] methods=faculty.getClass().getDeclaredMethods();
        List<String> actualMethodNames=new ArrayList<>();
        for(Method m:methods) {
            System.out.println(m.getName());
            boolean annotationspresent = m.isAnnotationPresent(DevelopmentHistoryWithReviewer.class);
            if (annotationspresent) {
                System.out.println(m.getDeclaredAnnotations().length);
                actualMethodNames.add(m.getName());
            }
        }
        assertTrue(Arrays.asList("research").containsAll(actualMethodNames));
    }
    @Test
    void test3() {
        Object faculty = new Faculty("Muaz", "Student", 300000000);
        Method[] methods = faculty.getClass().getDeclaredMethods();
        List<String> actualMethodNames = new ArrayList<>();
        for (Method m : methods) {
            System.out.println(m.getName());
            boolean annotationspresent = m.isAnnotationPresent(DevelopmentHistoryWithReviewer.class);
            if (annotationspresent) {
                System.out.println(m.getDeclaredAnnotations().length);
                actualMethodNames.add(m.getName());
            }
        }
        assertTrue(Arrays.asList("teach").containsAll(actualMethodNames));
    }
    @Test
    void test4() {
        Object faculty = new Faculty("Muaz", "Student", 300000000);
        Constructor[] constructors=faculty.getClass().getDeclaredConstructors();
//        Method[] methods = faculty.getClass().getDeclaredMethods();
        List<String> actualConstructorNames = new ArrayList<>();
        for (Constructor m : constructors) {
            System.out.println(m.getName());
            boolean annotationspresent = m.isAnnotationPresent(DevelopmentHistoryWithReviewer.class);
            if (annotationspresent) {
//                System.out.println(m.getDeclaredAnnotations().length);
                actualConstructorNames.add(m.getName());
            }
        }
        assertTrue(Arrays.asList("Faculty").containsAll(actualConstructorNames));
    }
    @Test
    void test5() {
        Object faculty = new Faculty("Muaz", "Student", 300000000);
        Class<?> classes=faculty.getClass();
//        Constructor[] constructors=faculty.getClass().getDeclaredConstructors();
//        Method[] methods = faculty.getClass().getDeclaredMethods();
        List<String> actualConstructorNames = new ArrayList<>();
        //for (Class c:classes)
        {
            System.out.println(classes.getName());
            boolean annotationspresent = classes.isAnnotationPresent(DevelopmentHistoryWithReviewer.class);
            if (annotationspresent) {
//                System.out.println(m.getDeclaredAnnotations().length);
                actualConstructorNames.add(classes.getName());
            }
        }
        assertTrue(Arrays.asList("Faculty").containsAll(actualConstructorNames));
    }
}
