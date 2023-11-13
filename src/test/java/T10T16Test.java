import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class T10T16Test {

    @Test
    public void test1() throws CloneNotSupportedException {
        T10T16.Book book = T10T16.Book.builder()
                .title("title1")
                .author("author1")
                .price(1)
                .isbn("isbn1")
                .build();

        T10T16.Book bookClone = book.clone();

        assertThat(book == bookClone, is(false));
        assertThat(book.equals(bookClone), is(true));
    }

    @Test
    public void test2() {
        T10T16.Book book1 = T10T16.Book.builder()
                .title("title3")
                .author("author2")
                .price(1)
                .isbn("isbn1")
                .build();

        T10T16.Book book2 = T10T16.Book.builder()
                .title("title1")
                .author("author1")
                .price(1)
                .isbn("isbn2")
                .build();

        T10T16.Book book3 = T10T16.Book.builder()
                .title("title1")
                .author("author1")
                .price(1)
                .isbn("isbn3")
                .build();

        T10T16.Book book4 = T10T16.Book.builder()
                .build();

        var list = new ArrayList<>(List.of(book1, book2, book3, book4));


        list.sort(T10T16.BOOK_COMPARATOR);

        assertThat(list, is(List.of(book4, book2, book3, book1)));
    }
}
