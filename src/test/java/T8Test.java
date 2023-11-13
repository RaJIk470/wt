import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class T8Test {

    T8 t8 = new T8();

    @Test
    public void test1() {
        int[] array1 = new int[]{1, 5, 7, 8};
        int[] array2 = new int[]{2, 3, 4, 6, 9};

        assertThat(t8.activate(array1, array2), is(getExpected()));
    }

    private int[] getExpected() {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    }
}
