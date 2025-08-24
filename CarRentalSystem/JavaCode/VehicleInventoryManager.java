import java.util.List;

class VehicleIventoryManager {
    // Implementation of vehicle inventory management
    List<Vehicle> vehicles;

    VehicleIventoryManager(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}