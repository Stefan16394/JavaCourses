package P04_Book_Comparator;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        int result=book2.getTitle().compareTo(book1.getTitle());
        if (result!=0)
        {
            return result;
        }

        return Integer.compare(book2.getYear(),book1.getYear());

    }
}
