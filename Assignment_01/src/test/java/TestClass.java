import assignment1.Date;
import assignment1.LocalCalender;
import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;
import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass {
    @Test
    void test1(){
        LocalCalender calender=new LocalCalender();
        Date date = new Date(11,10,2022);
        assertEquals("12 10 2022",calender.changeDate(date));
    }
    @Test
    void test2(){
        LocalCalender calender=new LocalCalender();
        Date date = new Date(28,2,2020);
        assertEquals("29 2 2020",calender.changeDate(date));
    }
    @Test
    void test3(){
        LocalCalender calender=new LocalCalender();
        Date date = new Date(29,2,2020);
        assertEquals("1 3 2020",calender.changeDate(date));
    }
    @Test
    void test4(){
        LocalCalender calender=new LocalCalender();
        Date date = new Date(31,1,2020);
        assertEquals("1 2 2020",calender.changeDate(date));
    }
    @Test
    void test5(){
        LocalCalender calender=new LocalCalender();
        Date date = new Date(31,12,2021);
        assertEquals("1 1 2022",calender.changeDate(date));
    }
}
