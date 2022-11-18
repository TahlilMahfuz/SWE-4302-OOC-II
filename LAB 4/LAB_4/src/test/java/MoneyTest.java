import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {
    @Test
    public void TestMultiplication() {
        Dollar dollar = new Dollar(5);
        Dollar product = dollar.times(2);
        assertEquals(10,product.amount);
        product = dollar.times(3);
        assertEquals(15,product.amount);
    }

    @Test
    public void FrancMultiplication() {
        Franc franc = new Franc(5);
        Franc product = franc.times(2);
        assertEquals(10,product.amount);
        product = franc.times(3);
        assertEquals(15,product.amount);
    }

    @Test
    public void testEqualityDollar() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(10)));
    }

    @Test
    public void testEqualityFranc() {
        assertEquals(new Franc(5), new Franc(5));
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(10)));
    }
}
