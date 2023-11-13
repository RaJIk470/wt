import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class T7Test {

    T7 t7 = new T7();

    @Test
    public void test1() {
        int[] initial = new int[]{5, 1, 9, 3, 7, 4, 8, 6, 2};
        t7.activate(initial);
        assertThat(initial, is(getExpected()));
    }

    private int[] getExpected() {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    }
}
