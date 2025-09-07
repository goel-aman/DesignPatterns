package BookMyShowDesignPattern;

import java.util.*;

public class BookSeats {
    List<Seat> seat;
    Show show;
    Payment payment;
    int numberOfSeats;
    Bill bill;

    public BookSeats(List<Seat> seat, Show show, Payment payment, int numberOfSeats, Bill bill) {
        this.seat = seat;
        this.show = show;
        this.payment = payment;
        this.numberOfSeats = numberOfSeats;
        this.bill = bill;
    }

    


}
