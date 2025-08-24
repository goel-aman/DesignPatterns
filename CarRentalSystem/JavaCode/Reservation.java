import java.util.Date;

public class Reservation {
    int reservationId;
    User user;
    Vehicle vehicle;
    Date bookedFrom;
    Date bookedTill;
    Date bookingDate;

    ReservationStatus reservationStatus;

    // standard getters & setters
    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getBookedFrom() {
        return bookedFrom;
    }

    public void setBookedFrom(Date bookedFrom) {
        this.bookedFrom = bookedFrom;
    }

    public Date getBookedTill() {
        return bookedTill;
    }

    public void setBookedTill(Date bookedTill) {
        this.bookedTill = bookedTill;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    // bussiness logic
    public int createReserve(User user, Vehicle vehicle) {
        this.user = user;
        this.vehicle = vehicle;
        this.bookingDate = new Date();
        this.reservationStatus = ReservationStatus.Scheduled;

        this.reservationId = (int) (Math.random() * 1000);
        return reservationId;
    }

    
}
