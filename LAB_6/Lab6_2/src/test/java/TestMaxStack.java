import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TestMaxStack {
    @Test
    void test1(){
        MaxStack maxstack = new MaxStack();
        maxstack.push(3);
        maxstack.push(2);
        maxstack.push(5);
        maxstack.push(1);
        int expected1=5;
        assertEquals(expected1,maxstack.max());
    }
    @Test
    void test2(){
        MaxStack maxstack = new MaxStack();
        maxstack.push(3);
        maxstack.push(2);
        maxstack.push(5);
        maxstack.push(1);
        maxstack.pop();
        int expected1=5;
        assertEquals(expected1,maxstack.max());
    }
    @Test
    void test3(){
        MaxStack maxstack = new MaxStack();
        maxstack.push(1);
        maxstack.push(2);
        maxstack.push(3);
        maxstack.push(4);
        int expected1=4;
        assertEquals(expected1,maxstack.max());
    }
    @Test
    void test4(){
        MaxStack maxstack = new MaxStack();
        maxstack.push(1);
        maxstack.push(3);
        maxstack.push(4);
        maxstack.pop();
        int expected1=3;
        assertEquals(expected1,maxstack.max());
    }
}
