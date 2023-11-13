import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class T6Test {

    T6 t6 = new T6();

    @Test
    public void test1() {
        assertThat(t6.activate(new int[]{1, 2, 3}), is(getExpected()));
    }

    private int[][] getExpected() {
        return new int[][]{{1, 2, 3}, {2, 3, 1}, {3, 1, 2}};
    }

}
