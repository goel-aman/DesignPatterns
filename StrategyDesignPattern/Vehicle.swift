//
//  Vehicle.swift
//  StrategyDesignPattern
//
//  Created by Aman Goel on 22/04/25.
//

import Foundation

public protocol DriveStrategy {
   func drive() -> Void
}

class Vehicle {
    var driveObject: DriveStrategy
    
    init(driveObject: DriveStrategy) {
        self.driveObject = driveObject
    }
    
    func drive() {
        driveObject.drive()
    }
}
