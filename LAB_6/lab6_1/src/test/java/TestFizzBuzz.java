import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TestFizzBuzz {
    @Test
    void testFizz(){
        String expected="Fizz";
        FizzBuzz fizz = new Fizz();
        assertEquals(expected,fizz.getFizzyBuzz(6));
    }
    @Test
    void testBuzz(){
        String expected="Buzz";
        FizzBuzz fizz = new Buzz();
        assertEquals(expected,fizz.getFizzyBuzz(20));
    }
    @Test
    void testFizzBuzz(){
        String expected="FizzBuzz";
        FizzBuzz fizz = new FizzBuzz2();
        assertEquals(expected,fizz.getFizzyBuzz(15));
    }
    @Test
    void testBoom(){
        String expected="Boom";
        FizzBuzz fizz = new FizzBuzz2();
        assertEquals(expected,fizz.getFizzyBuzz(7));
    }
}
