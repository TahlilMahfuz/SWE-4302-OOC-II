import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testEmployee {
    @Test
    void test1(){
        FulltimeEmployee fulltimeEmployee=new FulltimeEmployee();
        fulltimeEmployee.DaysWorked=10;
        fulltimeEmployee.BaseSalary=1000;
        double ex1=33600.0;
        assertEquals(ex1,fulltimeEmployee.yearlySalary());
    }
    @Test
    void test2(){
        FulltimeEmployee fulltimeEmployee=new FulltimeEmployee();
        fulltimeEmployee.DaysWorked=10;
        fulltimeEmployee.BaseSalary=1000;
        double ex1=33600.0;
        double ex2=10.5;
        assertEquals(ex2,fulltimeEmployee.yearlyLeaves());
    }

    @Test
    void test3(){
        Contractual contractual=new Contractual();
        contractual.DaysWorked=10;
        contractual.BaseSalary=1000;
        double ex1=12000.0;
        assertEquals(ex1,contractual.yearlySalary());
    }
    @Test
    void test4(){
        FulltimeEmployee fulltimeEmployee=new FulltimeEmployee();
        fulltimeEmployee.DaysWorked=10;
        fulltimeEmployee.BaseSalary=1000;
        double ex2=10.5;
        assertEquals(ex2,fulltimeEmployee.yearlyLeaves());
    }

    @Test
    void test5(){
        PartTime pattime=new PartTime();
        pattime.DaysWorked=10;
        pattime.BaseSalary=1000;
        double ex1=5400.0;
        assertEquals(ex1,pattime.yearlySalary());
    }
    @Test
    void test6(){
        PartTime pattime=new PartTime();
        pattime.DaysWorked=10;
        pattime.BaseSalary=1000;
        double ex2=0.0;
        assertEquals(ex2,pattime.yearlyLeaves());
    }
}
