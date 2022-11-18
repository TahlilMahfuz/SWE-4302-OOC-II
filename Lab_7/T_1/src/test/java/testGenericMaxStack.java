import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testGenericMaxStack {
    @Test
    void test1(){
        GenericMaxStack<Integer> maxStack = new GenericMaxStack<>();
        maxStack.push(3);
        maxStack.push(5);
        maxStack.push(2);
        int expected1=5;
        assertEquals(expected1,maxStack.max());
    }
    @Test
    void test2(){
        GenericMaxStack<Integer> maxStack = new GenericMaxStack<>();
        maxStack.push(2);
        maxStack.push(1);
        maxStack.push(2);
        maxStack.push(5);
        maxStack.pop();
        int expected1=2;
        assertEquals(expected1,maxStack.max());
    }

    @Test
    void test3(){
        GenericMaxStack<Double> maxStack = new GenericMaxStack<>();
        maxStack.push(49.75);
        maxStack.push(23.54);
        maxStack.push(100.00);
        double expected1=100.0;
        assertEquals(expected1,maxStack.max());
    }
    @Test
    void test4(){
        GenericMaxStack<String> maxStack = new GenericMaxStack<>();
        maxStack.push("OOC is bad");
        maxStack.push("Nothing to understand");
        maxStack.push("Try hard");
        String expected1="OOC is bad";
        assertEquals(expected1,maxStack.max());
        maxStack.pop();
        String exp2="OOC is bad";
        assertEquals(exp2,maxStack.max());
    }
}
