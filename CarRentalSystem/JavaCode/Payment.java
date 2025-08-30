public class Payment {
    Bill bill;

    public void payBill(Bill bill) {
        // Payment processing logic & upadate the bill status
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
