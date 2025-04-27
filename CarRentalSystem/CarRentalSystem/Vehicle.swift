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
