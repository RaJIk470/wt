import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class T4Test {

    T4 t4 = new T4();

    @Test
    public void test1() {
        assertThat(t4.calculate(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}), is(getExpected()));
    }

    private List<Integer> getExpected() {
        return List.of(2, 3, 5, 7);
    }

}