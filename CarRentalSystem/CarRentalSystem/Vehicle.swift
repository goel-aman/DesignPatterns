//
//  Vehicle.swift
//  CarRentalSystem
//
//  Created by Aman Goel on 28/04/25.
//

import Foundation

class Vehicle {
    var vehicleId: Int
    var vehicleNumber: Int
//    var vehicleType: VehicleType
    var companyName: String
    var modelName: String
    var kmDriven: Int
    var manufacturingDate: Date
    var average: Int
    var cc: Int
    var dailyRentalCost: Int
    var hourlyRentalCost: Int
    var noOfSeat: Int
//    var status: Status
    
    
    init(vehicleId: Int, vehicleNumber: Int, companyName: String, modelName: String, kmDriven: Int, manufacturingDate: Date, average: Int, cc: Int, dailyRentalCost: Int, hourlyRentalCost: Int, noOfSeat: Int) {
        self.vehicleId = vehicleId
        self.vehicleNumber = vehicleNumber
        self.companyName = companyName
        self.modelName = modelName
        self.kmDriven = kmDriven
        self.manufacturingDate = manufacturingDate
        self.average = average
        self.cc = cc
        self.dailyRentalCost = dailyRentalCost
        self.hourlyRentalCost = hourlyRentalCost
        self.noOfSeat = noOfSeat
    }
    
    // you can define getters & setters for each one of them....
    
}

enum VehicleType {
    case CAR
}

enum Status {
    case ACTIVE
    case INACTIVE
}

class Store {
    var storeId: Int
    var inventoryManager: VehicleInventoryManagement
    var reservation: [Reservation]
    var location: Location
    
    init(storeId: Int, inventoryManager: VehicleInventoryManagement, reservation: [Reservation], location: Location) {
        self.storeId = storeId
        self.inventoryManager = inventoryManager
        self.reservation = reservation
        self.location = location
    }
    
    func getVehicles(vehicleType: VehicleType) -> [Vehicle] {
        return inventoryManager.getVehicle()
    }
    
    func setVehicle(vehicles: [Vehicle]) {
        inventoryManager.setVehicle(vehicles: vehicles)
    }
    
    func createReservation(Vehicle vehicle, User user) {
        var reservation: Reservation()
        
        
    }
}


class VehicleInventoryManagement {
    var vehicleList: [Vehicle]
    
    init(vehicleList: [Vehicle]) {
        self.vehicleList = vehicleList
    }
    
    func getVehicle() -> [Vehicle] {
        return vehicleList
    }
    
    func setVehicle(vehicles: [Vehicle]) {
        self.vehicleList = vehicles
    }
}

class Bill {
    var reservation: Reservation
    var billAmount: Double
    var isBillPaid: Bool
    
    init(reservation: Reservation, billAmount: Double, isBillPaid: Bool) {
        self.reservation = reservation
        self.billAmount = billAmount
        self.isBillPaid = isBillPaid
    }
    
    func computeBillAmount() -> Int {
        
        // do the computation for calculating billing amount...
        return 100
    }
}

class VehicleRentalSystem {
    var storeList: [Store]
    var userList: [User]
    
    init(storeList: [Store], userList: [User]) {
        self.storeList = storeList
        self.userList = userList
    }
    
    func getStore(location: Location) -> Store {
        
        // based on location we will return the store....
        return storeList[0]
    }
    
    // add Users..
    // remove Users...
    // add Stores...
    // remove stores...
}

class Reservation {
    var reservationId: Int
    var user: User
    var vehicle: Vehicle
    var bookingDate: Date
    var dateBookedFrom: Date
    var dateBookedTo: Date
    var fromTimeStamp: Int
    var pickUpLocation: Location
    var dropLocation: Location
    var reservationType: ReservationType
    var reservationStatus: ReservationStatus
    var location: Location
    
    init(reservationId: Int, user: User, vehicle: Vehicle, bookingDate: Date, dateBookedFrom: Date, dateBookedTo: Date, fromTimeStamp: Int, pickUpLocation: Location, dropLocation: Location, reservationType: ReservationType, reservationStatus: ReservationStatus, location: Location) {
        self.reservationId = reservationId
        self.user = user
        self.vehicle = vehicle
        self.bookingDate = bookingDate
        self.dateBookedFrom = dateBookedFrom
        self.dateBookedTo = dateBookedTo
        self.fromTimeStamp = fromTimeStamp
        self.pickUpLocation = pickUpLocation
        self.dropLocation = dropLocation
        self.reservationType = reservationType
        self.reservationStatus = reservationStatus
        self.location = location
    }
}

enum ReservationStatus {
    case SCHEDULED
    case INPROGRESS
    case COMPLETED
    case CANCELLED
}

enum ReservationType {
    
}


class Location {
    
}

class User {
    var userId: Int
    var userName: String
    var drivingLicense: Int
    
    init(userId: Int, userName: String, drivingLicense: Int) {
        self.userId = userId
        self.userName = userName
        self.drivingLicense = drivingLicense
    }
    
    func getUserName() -> String {
        return userName
    }
    
    func setUserName(name: String) {
        self.userName = name
    }
    
    func getUserId() -> Int {
        return userId
    }
    
    func setUserId(userId: Int) -> Int {
        self.userId = userId
    }
    
    func getDrivingLicense() -> Int {
        return drivingLicense
    }
    
    func setDrivingLicense(license: Int) {
        self.drivingLicense = license
    }
}
