import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class T2Test {

    T2 t2 = new T2();

    @Test
    public void test1() {
        assertEquals(true, t2.verify(0, 0));
    }

    @Test
    public void test2() {
        assertEquals(false, t2.verify(0, 100));
    }
}