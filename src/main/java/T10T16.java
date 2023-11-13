import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.*;

public class T10T16 {

    public static final Comparator<Book> BOOK_COMPARATOR = Comparator.comparing(Book::getTitle, Comparator.nullsFirst(Comparator.naturalOrder()))
            .thenComparing(Book::getAuthor, Comparator.nullsFirst(Comparator.naturalOrder()))
            .thenComparing(Book::getPrice)
            .thenComparing(Book::getIsbn, Comparator.nullsFirst(Comparator.naturalOrder()));

    @EqualsAndHashCode
    @ToString
    @SuperBuilder
    @Getter
    @Setter
    public static class Book implements Cloneable, Comparable<Book> {
        private String title;
        private String author;
        private int price;
        private String isbn;

        @Override
        protected Book clone() throws CloneNotSupportedException {
            return (Book) super.clone();
        }

        @Override
        public int compareTo(T10T16.Book o) {
            return Objects.compare(this.isbn, o.isbn, Comparator.nullsFirst(Comparator.naturalOrder()));
        }
    }

    @EqualsAndHashCode(callSuper = true)
    @ToString(callSuper = true)
    @SuperBuilder
    @Getter
    @Setter
    public static class ProgrammerBook extends Book {
        private String language;
        private int level;
    }
}
