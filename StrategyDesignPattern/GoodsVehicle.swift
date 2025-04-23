//
//  GoodsVehicle.swift
//  StrategyDesignPattern
//
//  Created by Aman Goel on 22/04/25.
//

import Foundation

class GoodsVehicle: Vehicle {
    init() {
        super.init(driveObject: NormalDriveStrategy())
    }
}
