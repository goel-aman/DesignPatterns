//
//  ViewController.swift
//  TicTacToeLowLevelDesign
//
//  Created by Aman Goel on 26/04/25.
//

import Cocoa

class ViewController: NSViewController {

    override func viewDidLoad() {
        super.viewDidLoad()

        // Do any additional setup after loading the view.
        
        var game = TicTacToeGame()
        game.initializeGame()
    }

    override var representedObject: Any? {
        didSet {
        // Update the view, if already loaded.
        }
    }


}

