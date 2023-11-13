import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class T5Test {

    T5 t5 = new T5();

    @Test
    public void test1() {
        assertEquals(0, t5.activate(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }

    @Test
    public void test2() {
        assertEquals(1, t5.activate(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 1}));
    }

    @Test
    public void test3() {
        assertEquals(5, t5.activate(new int[]{1, 2, 3, 0, -1, 6, 7, 8, 9, 1, 0, -1}));
    }
}
