package IteratorDesignPattern;
import java.util.*;

public class LibraryConcreteAggregate implements Aggregate {
    List<Book> bookList;

    public LibraryConcreteAggregate(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public IteratorInterface<Book> createIterator() {
        return new BookIterator(bookList);
    }   
}