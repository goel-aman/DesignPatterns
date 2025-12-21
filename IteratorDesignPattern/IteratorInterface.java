package IteratorDesignPattern;

public interface IteratorInterface<T> {
    public boolean hasNext();
    T next(); 
}
