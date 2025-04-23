//
//  OffRoadVehicle.swift
//  StrategyDesignPattern
//
//  Created by Aman Goel on 22/04/25.
//

import Foundation

class OffRoadVehicle: Vehicle {
    init() {
        super.init(driveObject: SportsDriveStrategy())
    }
}
