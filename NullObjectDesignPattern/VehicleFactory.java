package NullObjectDesignPattern;
import NullObjectDesignPattern.Vehicle;

public class VehicleFactory {
    Vehicle getVehicleObject(String typeOfVehicle) {
        if("Cars".equals(typeOfVehicle)) {
            return new Car();
        }

        return new NullVehicle();
    }
}
