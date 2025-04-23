//
//  ViewController.swift
//  StrategyDesignPattern
//
//  Created by Aman Goel on 22/04/25.
//

import Cocoa

class ViewController: NSViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        var instance: Vehicle  = OffRoadVehicle()
        instance.drive();
        var anotherInstance: Vehicle = GoodsVehicle()
        anotherInstance.drive()
        // Do any additional setup after loading the view.
    }

    override var representedObject: Any? {
        didSet {
        // Update the view, if already loaded.
        }
    }


}

