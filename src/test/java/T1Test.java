import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class T1Test {
    T1 t1 = new T1();

    private static final double EPS = 0.01;

    @Test
    public void test() {
        assertEquals(2, t1.calculate(1, 2), 0.01);
    }
}
