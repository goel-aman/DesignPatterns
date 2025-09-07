package BookMyShowDesignPattern;
import java.util.List;
import java.util.UUID;
import java.util.Date;

public class Bill {
    private Show show;
    private List<Seat> seats;
    private PaymentStatus status;
    private Date billDate;
    private String billId;
    private int amountPaid;
    private PricingType priceType;

    public Bill(List<Seat> seats) {
        this.status = PaymentStatus.UNPAID;
        this.seats = seats;
        this.billDate = new Date();
        this.amountPaid = 0;
        this.priceType = PricingType.Level1;
        UUID uniqueId = UUID.randomUUID();
        // Convert the UUID to a String representation
        this.billId = uniqueId.toString();
    }

    void computeCost() {
        int totalCost = 0;

        for(Seat seat: seats) {
            switch(priceType) {
                case PricingType.Level1:
                    totalCost += seat.primaryPricing;

                case PricingType.Level2:
                    totalCost += seat.secondaryPricing;

                case PricingType.Level3:
                    totalCost += seat.tertiaryPricing;
                
                default:
                    totalCost += seat.primaryPricing;
            }
        }

        amountPaid = totalCost;
    }

    
    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public PricingType getPriceType() {
        return priceType;
    }

    public void setPriceType(PricingType priceType) {
        this.priceType = priceType;
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
        return billDate;
    }
    public void setPaymentDate(Date billDate) {
        this.billDate = billDate;
    }
    public String getBillId() {
        return billId;
    }
    public void setBillId(String billId) {
        this.billId = billId;
    }
    public int getAmountPaid() {
        return amountPaid;
    }
    public void setAmountPaid(int amountPaid) {
        this.amountPaid = amountPaid;
    }
}
