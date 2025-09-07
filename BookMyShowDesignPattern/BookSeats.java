package BookMyShowDesignPattern;

import java.util.*;

public class BookSeats {
    private List<Seat> seats;
    private Show show;
    private Payment payment;
    Bill bill;

    public BookSeats(List<Seat> seat, Show show, Payment payment) {
        this.seats = seat;
        this.show = show;
        this.payment = payment;
        bill = new Bill(seat);
    }

    public void generateBill(PricingType type) {
        // this value will be coming from Content-Management-System..
        bill.setPriceType(PricingType.Level2);
        bill.computeCost();
    }

    public void initiatePayment() {
        if (payment.processPayment(bill.getAmountPaid())) {

        }
    }


    // Getters & Setters...
        public List<Seat> getSeat() {
        return seats;
    }

    public void setSeat(List<Seat> seat) {
        this.seats = seat;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
    
}
