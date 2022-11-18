import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestTrip {
    @Test
    void test1(){
        Sedan sedan = new Sedan(10,20,30);
        assertEquals(10,sedan.perHeadFare());
        assertFalse(sedan.canTakeTrip());
    }
    @Test
    void test2(){
        MotorBike motorBike = new MotorBike(10,20,30);
        assertEquals(5,motorBike.perHeadFare());
        assertFalse(motorBike.canTakeTrip());
    }
    @Test
    void test3(){
        SevenSeater ss = new SevenSeater(10,20,30);
        assertEquals(10,ss.perHeadFare());
        assertFalse(ss.canTakeTrip());
    }

}
