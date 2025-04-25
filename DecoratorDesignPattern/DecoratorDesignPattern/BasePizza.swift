//
//  BasePizza.swift
//  DecoratorDesignPattern
//
//  Created by Aman Goel on 25/04/25.
//

import Foundation

protocol BasePizza {
    func cost() -> Int
}


class Farmhouse: BasePizza {
    func cost() -> Int {
        return 200
    }
}

class VegDelight: BasePizza {
    func cost() -> Int {
        return 120
    }
}

class Margherita: BasePizza {
    func cost() -> Int {
        return 100;
    }
}

protocol ToppingDecorator: BasePizza {
    var basePizza: BasePizza { get set }
}

public class ExtraCheese: ToppingDecorator {
    var basePizza: any BasePizza
    
    init(basePizza: any BasePizza) {
        self.basePizza = basePizza
    }
    
    func cost() -> Int {
        return basePizza.cost() + 100
    }
}


public class Mushroom: ToppingDecorator {
    var basePizza: any BasePizza
    
    init(basePizza: any BasePizza) {
        self.basePizza = basePizza
    }
    
    func cost() -> Int {
        return basePizza.cost() + 150
    }
}

