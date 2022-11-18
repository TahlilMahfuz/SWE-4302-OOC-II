import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMasterProgram {
    @Test
    public void isEligibleThesis(){
        OldMastersProgram mp = new OldMastersProgram(DegreeType.RegularThesis, "swe");
        boolean isEligible = mp.isEligible(2, "swe");
        assertFalse(isEligible);
        isEligible = mp.isEligible(3.9f, "swe");
        assertTrue(isEligible);
    }
    @Test
    public void getMarksThesis(){
        OldMastersProgram mp = new OldMastersProgram(DegreeType.RegularNonThesis, "swe");
        int marks = mp.getMarks(80,60, 40);
        assertEquals(100, marks);
    }
    @Test
    public void isEligibleThesisDifferentMajor(){
        OldMastersProgram mp = new OldMastersProgram(DegreeType.RegularThesis, "cse");
        boolean isEligible = mp.isEligible(3.9f, "swe");
        assertFalse(isEligible);
    }
    @Test
    void test1(){
        RegularThesis reg = new RegularThesis("cse");
        boolean isEligible = reg.isEligible(2, "cse");
        assertFalse(isEligible);
        isEligible = reg.isEligible(3.86f, "cse");
        assertTrue(isEligible);
    }
    @Test
    void test2(){
        NonRegularThesis mp = new NonRegularThesis("cse");
        boolean isEligible = mp.isEligible(2, "swe");
        assertFalse(isEligible);
        isEligible = mp.isEligible(3.9f, "swe");
        assertFalse(isEligible);
    }
    @Test
    void test3(){
        ExecutiveMasterProgram mp = new ExecutiveMasterProgram("cse");
        boolean isEligible = mp.isEligible(2, "swe");
        assertFalse(isEligible);
        int marks = mp.getMarks(80,60, 40);
        assertEquals(80, marks);
    }
}
