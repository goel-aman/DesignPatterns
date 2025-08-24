import java.util.ArrayList;
import java.util.List;

public class Store {
    int storeId;
    VehicleIventoryManager inventory;
    Location location;
    List<Reservation> reservations;

    Store(int storeId, VehicleIventoryManager inventory, Location location, List<Reservation> reservation) {
        this.storeId = storeId;
        this.inventory = inventory;
        this.location = location;
        this.reservations = reservation;
    }

    Store(int storeId, VehicleIventoryManager inventory, Location location) {
        this.storeId = storeId;
        this.inventory = inventory;
        this.location = location;
        this.reservations = new ArrayList<>();
    }
    
    // standard getters & setters
    public int getStoreId() {
        return storeId;
    }
    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }
    public VehicleIventoryManager getInventory() {
        return inventory;
    }
    public void setInventory(VehicleIventoryManager inventory) {
        this.inventory = inventory;
    }
    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
    public List<Reservation> getReservation() {
        return reservations;
    }
    public void setReservation(List<Reservation> reservation) {
        this.reservations = reservation;
    }


    // other methods
    public void setVehicle(List<Vehicle> vehicles) {
        inventory = new VehicleIventoryManager(vehicles);
    }

    public List<Vehicle> getVehicles(VehicleType vehicleType) {
        return inventory.getVehicles();
    }
    
    public Reservation createReservation(User user, Vehicle vehicle) {
        Reservation reservation = new Reservation();
        reservation.createReserve(user, vehicle);
        reservations.add(reservation);
        return reservation;
    }

    public boolean completeReservation(int reservationId) {
        for(Reservation r : reservations) {
            if(r.getReservationId() == reservationId) {
                r.setReservationStatus(ReservationStatus.Completed);
                return true;
            }
        }

        return false;
    }
}
