import org.junit.Test;

import java.util.List;

import static java.awt.Color.BLUE;
import static java.awt.Color.YELLOW;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.Matchers.is;

public class T9Test {

    T9 t9 = new T9();

    @Test
    public void test1() {
        T9.Ball ball1 = new T9.Ball(YELLOW, 1.0);
        T9.Ball ball2 = new T9.Ball(BLUE, 1.0);

        T9.Basket basket = new T9.Basket(List.of(ball1, ball2));

        assertEquals(2.0, t9.getWeight(basket), 0.01);
    }

    @Test
    public void test2() {
        T9.Ball ball1 = new T9.Ball(YELLOW, 1.0);
        T9.Ball ball2 = new T9.Ball(BLUE, 1.0);
        T9.Ball ball3 = new T9.Ball(BLUE, 1.0);

        T9.Basket basket = new T9.Basket(List.of(ball1, ball2, ball3));

        assertThat(t9.filterBy(basket, b -> b.color() == BLUE), is(List.of(ball2, ball3)));
    }
}
