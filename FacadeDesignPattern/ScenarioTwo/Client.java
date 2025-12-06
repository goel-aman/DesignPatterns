package FacadeDesignPattern.ScenarioTwo;

public class Client {
    public static void main(String[] args) {
        // by using facade we were able to hide the complexity of the subsystem
        // i.e. order generation, process which involves invoice generation, payment processing and notification sending
        
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder();
    }
}
