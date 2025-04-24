//
//  StockObservable.swift
//  ObserverDesignPattern
//
//  Created by Aman Goel on 24/04/25.
//

import Foundation

protocol NotificationAlertObserver {
    var id: Int { get set }
    var observable: StockObservable { get set }
    func notify()
}

protocol StockObservable {
    var observerList: [NotificationAlertObserver] { get set }
    func add(_ input: NotificationAlertObserver)
    func remove(_ input: NotificationAlertObserver)
    func notifySubscribers()
    func getStockCount() -> Int
}

public class EmailNotificationAlert: NotificationAlertObserver {
    var observable: any StockObservable
    var id: Int
    
    init(id: Int, observable: StockObservable) {
        self.id = id
        self.observable = observable
    }
    
    func notify() {
        print("Sending On Email: \(observable.getStockCount()) of pieces are available for this particular product...")
    }
    
    
}

public class MobileNotificationAlert: NotificationAlertObserver {
    var observable: any StockObservable
    
    var id: Int
    
    init(id: Int, observable: StockObservable) {
        self.id = id
        self.observable = observable
    }
    
    func notify() {
        print("Sending On Mobile: \(observable.getStockCount())  of pieces are available for this particular product...")
    }
}

public class Iphone: StockObservable {
    var stock: Int = 0
    var observerList: [any NotificationAlertObserver] = []
    
    func add(_ input: any NotificationAlertObserver) {
        observerList.append(input)
    }
    
    func remove(_ input: any NotificationAlertObserver) {
        observerList.removeAll { notifcationObserver in
            if (input.id == notifcationObserver.id) {
                return true
            } else {
                return false
            }
        }
    }
    
    func notifySubscribers() {
        for notificationObserver in observerList {
            notificationObserver.notify()
        }
    }
    
    func setStockCount(newStockAdded: Int) {
        if(stock == 0) {
            stock = stock + newStockAdded
            notifySubscribers()
        }
        
        
    }
    
    func getStockCount() -> Int {
        return stock
    }
}



public class Store {
    var iphoneStockObservable = Iphone()
    let firstObserver: NotificationAlertObserver
    let secondObserver: NotificationAlertObserver
    let thirdObserver: NotificationAlertObserver
    
    init() {
        firstObserver = EmailNotificationAlert(id: 1, observable: iphoneStockObservable)
        secondObserver = MobileNotificationAlert(id: 2, observable: iphoneStockObservable)
        thirdObserver = EmailNotificationAlert(id: 3,observable: iphoneStockObservable)
        
        iphoneStockObservable.add(firstObserver)
        iphoneStockObservable.add(secondObserver)
        iphoneStockObservable.add(thirdObserver)
        
        iphoneStockObservable.setStockCount(newStockAdded: 10)
    }
    
}
