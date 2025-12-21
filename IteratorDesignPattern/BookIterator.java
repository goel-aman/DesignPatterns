package IteratorDesignPattern;
import java.util.*;

public class BookIterator implements IteratorInterface<Book> {

    private int index = 0;
    private List<Book> bookList;

    public BookIterator(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public boolean hasNext() {
        return index < bookList.size();
    }

    @Override
    public Book next() {
        Book value = bookList.get(index);
        index++;
        return value;
    }
    
}
