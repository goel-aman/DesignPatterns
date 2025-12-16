package InventoryManagementSystem;


enum City {
    Delhi,
    jaipur,
    Mumbai,
    Banagalore,
}


public class Address {
    String flatNumber;
    String firstLane;
    String secondLane;
    City city;
    int pinCode;

    public Address(String flatNumber, String firsLane, String secondLane, City city, int pincode) {
        this.flatNumber = flatNumber;
        this.firstLane = firsLane;
        this.secondLane = secondLane;
        this.city = city;
        this.pinCode = pincode;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getFirstLane() {
        return firstLane;
    }

    public void setFirstLane(String firstLane) {
        this.firstLane = firstLane;
    }

    public String getSecondLane() {
        return secondLane;
    }

    public void setSecondLane(String secondLane) {
        this.secondLane = secondLane;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    
}
