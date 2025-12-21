package IteratorDesignPattern;

public class Book {
    private String bookName;
    private int price;
    
    public Book(String bookName, int price) {
        this.bookName = bookName;
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printBookDetails() {
        System.out.println("Book Price is: " + this.price + " book Name is: " + this.bookName);
    }
}
