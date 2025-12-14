package InventoryManagementSystem;


enum City {
    Delh,
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
}
