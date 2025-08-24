public class Bill {
    Reservation reservation;
    Boolean isPaid;
    int amount;

    Bill(Reservation reservation) {
        this.reservation = reservation;
        this.isPaid = false;
        this.amount = computeBillAmount();
    }

    public int computeBillAmount() {
        // Logic to compute bill amount
        return 100;
    }

    public Reservation getReservation() {
        return reservation;
    }
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
    public Boolean getIsPaid() {
        return isPaid;
    }
    public void setIsPaid(Boolean isPaid) {
        this.isPaid = isPaid;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

    
}
