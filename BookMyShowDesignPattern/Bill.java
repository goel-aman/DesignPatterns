package BookMyShowDesignPattern;
import java.util.List;
import java.util.Date;


public class Bill {
    Show show;
    List<Seat> seats;
    PaymentStatus status;
    Date billDate;
    int billId;
    int amountPaid;

    public Bill() {
        this.status = PaymentStatus.UNPAID;
        
    }

    public Show getShow() {
        return show;
    }
    public void setShow(Show show) {
        this.show = show;
    }
    public List<Seat> getSeats() {
        return seats;
    }
    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
    public PaymentStatus getStatus() {
        return status;
    }
    public void setStatus(PaymentStatus status) {
        this.status = status;
    }
    public Date getPaymentDate() {
        return paymentDate;
    }
    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
    public int getBillId() {
        return billId;
    }
    public void setBillId(int billId) {
        this.billId = billId;
    }
    public int getAmountPaid() {
        return amountPaid;
    }
    public void setAmountPaid(int amountPaid) {
        this.amountPaid = amountPaid;
    }

    
}
