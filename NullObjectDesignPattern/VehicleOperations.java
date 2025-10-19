package NullObjectDesignPattern;



public class VehicleOperations {
    private static void printVehicleDetails(Vehicle vehicle) {
        if(vehicle != null) {
            System.out.println("Seating Capacity: " + vehicle.getSeatingCapacity());
            System.out.println("Fuel Tank Capacity: " + vehicle.getTankCapacity());
        }
    }   
}
