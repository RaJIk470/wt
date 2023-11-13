import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertEquals;

public class T3Test {

    T3 t3 = new T3();

    private static final double EPS = 0.01;

    @Test(expected = IllegalArgumentException.class)
    public void test1() {
        t3.calculate(1, 0, 0.1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test2() {
        t3.calculate(1, 2, -0.1);
    }

    @Test
    public void test3() {
        var result = t3.calculate(1, 2, 0.3);

        assertThat(result, hasSize(4));
        assertEquals(result.get(0).x(), 1.0, EPS);
        assertEquals(result.get(0).y(), 1.55, EPS);
        assertEquals(result.get(1).x(), 1.3, EPS);
        assertEquals(result.get(1).y(), 3.60, EPS);
        assertEquals(result.get(2).x(), 1.6, EPS);
        assertEquals(result.get(2).y(), -34.23, EPS);
        assertEquals(result.get(3).x(), 1.90, EPS);
        assertEquals(result.get(3).y(), -2.92, EPS);
    }
}