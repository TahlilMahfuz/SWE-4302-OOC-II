import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testArray {
    @Test
    void Test1(){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(5);
        arr.add(6);
        int count = 2;
        assertEquals(count,Algorithm.countIf(arr, new TestEvenArray()));
    }
    @Test
    void Test2(){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(5);
        arr.add(6);
        int count = 2;
        assertEquals(count,Algorithm.count(arr));
    }
}
