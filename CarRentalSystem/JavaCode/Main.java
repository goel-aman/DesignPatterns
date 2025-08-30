import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Car Rental System");

        // Create User
        List<User> users = addUsers();
        List<Vehicle> vehicles = addVehicle();
        List<Store> stores = addStore();

        VehicleRentalSystem vehicleRentalSystem = new VehicleRentalSystem(stores, users);

        User user = users.get(0);

        Location location = new Location();
        location.setCity("San Jose");
        location.setState("CA");
        location.setAddress("123 Main St");
        location.setPinCode(95112);

        Store store = vehicleRentalSystem.findStore(location);

        // Select A Vehicle
        List<Vehicle> availableVehicles = store.getVehicles(VehicleType.CAR);

        // Reserve Particular Vehicle.
        Reservation reservation = store.createReservation(user, availableVehicles.get(0));

        // Do Billing & Payment...
        Payment payment = new Payment();
        Bill bill = new Bill(reservation);

        payment.payBill(bill);

        bill.setIsPaid(true);

        store.completeReservation(reservation.reservationId)
    }

    public static List<User> addUsers() {
        User user = new User(1, "DL12345", "John Doe");
        List<User> users = new ArrayList<>();
        users.add(user);
        return users;
    }

    public static List<Vehicle> addVehicle() {
        List<Vehicle> vehicles = new ArrayList<>();

        Vehicle car1 = new Car();
        car1.setVehicleId(2);
        car1.setVehicleType(VehicleType.CAR);
        

        Vehicle car2 = new Car();
        car2.setVehicleId(3);
        car2.setVehicleType(VehicleType.CAR);

        vehicles.add(car2);
        vehicles.add(car1);
        
        return vehicles;
    }

    public static List<Store> addStore() {
        VehicleIventoryManager inventory = new VehicleIventoryManager(addVehicle());
        Location location = new Location();

        Store store = new Store(1, inventory, location);
        List<Store> stores = new ArrayList<>();
        store.setStoreId(1);
        
        stores.add(store);
        return stores;
    }
}
