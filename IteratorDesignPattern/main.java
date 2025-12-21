package IteratorDesignPattern;
import java.util.*;
public class main {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<Book>();
        
        Book first = new Book("Charles", 10);
        Book second = new Book("Sherlock Homes", 20);
        list.add(first);
        list.add(second);

        LibraryConcreteAggregate library = new LibraryConcreteAggregate(list);

        IteratorInterface iterator = library.createIterator();

        while(iterator.hasNext()) {
            Book value = (Book) iterator.next();
            value.printBookDetails();
        }
    }
}
